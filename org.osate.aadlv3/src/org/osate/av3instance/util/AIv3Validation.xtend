package org.osate.av3instance.util

import java.util.ArrayList
import java.util.Collection
import org.eclipse.xtext.EcoreUtil2
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint
import org.osate.aadlv3.aadlv3.PropertyDefinition
import org.osate.aadlv3.util.Diagnostic
import org.osate.aadlv3.util.DiagnosticUtil
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.FeatureInstance

import static extension org.osate.aadlv3.util.AIv3API.*
import static extension org.osate.aadlv3.util.ProductLineConstraint.*

class AIv3Validation {
	
	def static Collection<Diagnostic> validateProductLineConstraint(ComponentInstance root,
		MultiLiteralConstraint constraint) {
		val issues = new ArrayList<Diagnostic>
		val ios = EcoreUtil2.getAllContentsOfType(root, ComponentInstance)
		for (io : ios) {
			if (!io.satisfies(constraint)) {
				issues.add(DiagnosticUtil.createError(io, "Does not meet product line constraint " + io.name))
			}
		}
		issues
	}
	
	
	/**
	 * validate that all expected properties have been assigned
	 * Useful as precondition for a given analysis
	 */
	def static Collection<Diagnostic> validateExpectedPropertyValues(ComponentInstance root, Iterable<PropertyDefinition> pds){
		val issues = new ArrayList<Diagnostic>
		val ios = EcoreUtil2.getAllContentsOfType(root, ComponentInstance)+EcoreUtil2.getAllContentsOfType(root, FeatureInstance)+EcoreUtil2.getAllContentsOfType(root, AssociationInstance)
		for (io : ios) {
			for (pd : pds) {
				if (!io.hasPropertyAssociation(pd)) {
					issues.add(DiagnosticUtil.createError(io, "Missing property value "+pd.name))
				}
			}
		}
		issues
	}
	
}
