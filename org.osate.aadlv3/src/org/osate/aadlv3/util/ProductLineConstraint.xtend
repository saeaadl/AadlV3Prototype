package org.osate.aadlv3.util

import java.util.ArrayList
import java.util.Collection
import org.eclipse.xtext.EcoreUtil2
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ComponentRealization
import org.osate.aadlv3.aadlv3.InstanceConfiguration
import org.osate.aadlv3.aadlv3.ECollection
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint
import org.osate.aadlv3.aadlv3.NamedElement
import org.osate.aadlv3.aadlv3.NamedType
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.av3instance.av3instance.ComponentInstance

import static extension org.osate.aadlv3.util.Aadlv3Util.*

class ProductLineConstraint {
	
	/**
	 * value satisfies constraint if one of the constraint alternatives is a subset of value
	 * value: a collection of literals associated with a classifier
	 * constraint: a collection of alternatives (ANY) where each alternative represents a single literal or collection of literals (ALL)
	 */
	def static boolean satisfies(ECollection value, MultiLiteralConstraint constraint) {
		if (constraint === null|| value === null) return true
		constraint.elements.exists[alt| value.contains(alt)]
		return false
	}

	
	/**
	 * the feature labels of ci satisfies the specified constraint
	 */
	def static boolean satisfies(ComponentInstance ci, MultiLiteralConstraint constraint) {
		if (constraint === null) return true
		val match = ci.getFeatureLabels();
		if (match === null) return true
		return match.satisfies(constraint)
	}
	
	/**
	 * the product line qualifier of cl satisfies the specified constraint
	 */
	def static boolean satisfies(NamedType cl, MultiLiteralConstraint constraint) {
		if (constraint === null) return true
		val match = cl.getFeatureLabels();
		if (match === null) return true
		return match.satisfies(constraint)
	}

	
	/**
	 * all elements of trefs satisfy the specified constraint
	 */
	def static boolean satisfies(Iterable<TypeReference> trefs, MultiLiteralConstraint constraint) {
		if (constraint === null) return true
		return trefs.forall[tref| tref.type.satisfies(constraint)]
	}

	val static String FeatureLabels = "FeatureLabels";
	
	def static MultiLiteralConstraint getProductLineConstraint(InstanceConfiguration ic){
		return ic.propertyConstraint?.constraintExpression
	}
	
	def static ECollection getFeatureLabels(NamedElement cl){
		return getOwnedPropertyValue(cl,FeatureLabels) as ECollection
	}
	
	
	/**
	 * get all realizations of a given component interface that satisfy the specified Product Line Qualifier constraint
	 * @param cinterface
	 * @return
	 */
	def static Iterable<ComponentRealization> getConfigurableRealizations(ComponentInterface classifier, MultiLiteralConstraint productLineQualifierconstraint) {
		val all = Av3API.getAllRealizations(classifier);
		return all.filter[cl|cl.satisfies(productLineQualifierconstraint)];
	}

	
	/**
	 * validate by examining the instance model FeatureLabels property
	 */
	def static Collection<Diagnostic> validateProductLineConstraint(ComponentInstance root,
		MultiLiteralConstraint constraint) {
		val issues = new ArrayList<Diagnostic>
		val ios = EcoreUtil2.getAllContentsOfType(root, ComponentInstance)
		for (io : ios) {
			issues += validateConfiguredComponentInstance(io,constraint)
		}
		issues
	}

	/**
	 * all configured classifiers of component instance satisfy the specified constraint
	 */
	def static Collection<Diagnostic> validateConfiguredComponentInstance(ComponentInstance ci, MultiLiteralConstraint constraint) {
		val trefs = getConfiguredTypeReferences( ci);
		val issues = new ArrayList<Diagnostic>
		if (constraint !== null) {
			for (tref : trefs){
				if (!tref.type.satisfies(constraint)){
					issues.add(DiagnosticUtil.createError(ci, "Configured classifier "+tref.type.name+" does not meet product line constraint"))
				}
			}
		}
		return issues
	}


}
