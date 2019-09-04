package org.osate.aadlv3.util

import org.osate.aadlv3.aadlv3.Classifier
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ComponentRealization
import org.osate.aadlv3.aadlv3.InstanceConfiguration
import org.osate.aadlv3.aadlv3.LCollection
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint
import org.osate.aadlv3.aadlv3.NamedElement
import org.osate.aadlv3.aadlv3.NamedType
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.av3instance.av3instance.ComponentInstance

import static extension org.osate.aadlv3.util.Aadlv3Util.*

class ProductLineConstraint {
	
	/**
	 * the product line qualifier of cl satisfies the specified constraint
	 */
	def static boolean satisfies(ComponentInstance ci, MultiLiteralConstraint constraint) {
		if (constraint === null) return true
		val match = ci.getProductLineQualifier();
		if (match === null) return true
		return match.satisfies(constraint)
	}
	
	/**
	 * the product line qualifier of cl satisfies the specified constraint
	 */
	def static boolean satisfies(NamedType cl, MultiLiteralConstraint constraint) {
		if (constraint === null) return true
		val match = cl.getProductLineQualifier();
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


	val static String ProductLineQualifier = "FeatureLabels";
	
	def static MultiLiteralConstraint getProductLineConstraint(InstanceConfiguration ic){
		return ic.propertyConstraint?.constraintExpression
	}
	
	def static LCollection getProductLineQualifier(NamedElement cl){
		return getOwnedPropertyValue(cl,ProductLineQualifier) as LCollection
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

}
