/**
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.av3instance.av3instance.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.osate.aadlv3.aadlv3.Expression;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.av3instance.av3instance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.av3instance.av3instance.Av3instancePackage
 * @generated
 */
public class Av3instanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Av3instancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Av3instanceSwitch() {
		if (modelPackage == null) {
			modelPackage = Av3instancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Av3instancePackage.INSTANCE_OBJECT: {
			InstanceObject instanceObject = (InstanceObject) theEObject;
			T result = caseInstanceObject(instanceObject);
			if (result == null)
				result = caseNamedElement(instanceObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.FEATURE_INSTANCE: {
			FeatureInstance featureInstance = (FeatureInstance) theEObject;
			T result = caseFeatureInstance(featureInstance);
			if (result == null)
				result = caseInstanceObject(featureInstance);
			if (result == null)
				result = caseNamedElement(featureInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.COMPONENT_INSTANCE: {
			ComponentInstance componentInstance = (ComponentInstance) theEObject;
			T result = caseComponentInstance(componentInstance);
			if (result == null)
				result = caseInstanceObject(componentInstance);
			if (result == null)
				result = caseNamedElement(componentInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.ASSOCIATION_INSTANCE: {
			AssociationInstance associationInstance = (AssociationInstance) theEObject;
			T result = caseAssociationInstance(associationInstance);
			if (result == null)
				result = caseInstanceObject(associationInstance);
			if (result == null)
				result = caseNamedElement(associationInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.PATH_INSTANCE: {
			PathInstance pathInstance = (PathInstance) theEObject;
			T result = casePathInstance(pathInstance);
			if (result == null)
				result = caseInstanceObject(pathInstance);
			if (result == null)
				result = caseNamedElement(pathInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE: {
			BehaviorRuleInstance behaviorRuleInstance = (BehaviorRuleInstance) theEObject;
			T result = caseBehaviorRuleInstance(behaviorRuleInstance);
			if (result == null)
				result = caseInstanceObject(behaviorRuleInstance);
			if (result == null)
				result = caseNamedElement(behaviorRuleInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.GENERATOR_INSTANCE: {
			GeneratorInstance generatorInstance = (GeneratorInstance) theEObject;
			T result = caseGeneratorInstance(generatorInstance);
			if (result == null)
				result = caseInstanceObject(generatorInstance);
			if (result == null)
				result = caseNamedElement(generatorInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT: {
			ConstrainedInstanceObject constrainedInstanceObject = (ConstrainedInstanceObject) theEObject;
			T result = caseConstrainedInstanceObject(constrainedInstanceObject);
			if (result == null)
				result = caseInstanceObject(constrainedInstanceObject);
			if (result == null)
				result = caseLiteral(constrainedInstanceObject);
			if (result == null)
				result = caseNamedElement(constrainedInstanceObject);
			if (result == null)
				result = caseExpression(constrainedInstanceObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Av3instancePackage.STATE_INSTANCE: {
			StateInstance stateInstance = (StateInstance) theEObject;
			T result = caseStateInstance(stateInstance);
			if (result == null)
				result = caseInstanceObject(stateInstance);
			if (result == null)
				result = caseNamedElement(stateInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceObject(InstanceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInstance(FeatureInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationInstance(AssociationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathInstance(PathInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Rule Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Rule Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorRuleInstance(BehaviorRuleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorInstance(GeneratorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Instance Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Instance Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedInstanceObject(ConstrainedInstanceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInstance(StateInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Av3instanceSwitch
