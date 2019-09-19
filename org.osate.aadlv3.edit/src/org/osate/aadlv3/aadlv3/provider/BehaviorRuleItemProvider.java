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
package org.osate.aadlv3.aadlv3.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadlv3.aadlv3.Aadlv3Factory;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.BehaviorRule;

/**
 * This is the item provider adapter for a {@link org.osate.aadlv3.aadlv3.BehaviorRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorRuleItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR_RULE__CURRENT_STATE);
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR_RULE__TARGET_STATE);
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION);
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR_RULE__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BehaviorRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviorRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehaviorRule) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BehaviorRule_type")
				: getString("_UI_BehaviorRule_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BehaviorRule.class)) {
		case Aadlv3Package.BEHAVIOR_RULE__CURRENT_STATE:
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
		case Aadlv3Package.BEHAVIOR_RULE__ACTIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CURRENT_STATE,
				Aadlv3Factory.eINSTANCE.createStateSpecification()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__TARGET_STATE,
				Aadlv3Factory.eINSTANCE.createStateSpecification()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createModelElementReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createPathElement()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createDirectionalLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createECollection()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createListLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createSetLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createMultiOperandExpression()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createMultiLiteralConstraint()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createConditionOperation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__CONDITION,
				Aadlv3Factory.eINSTANCE.createPackageElementReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR_RULE__ACTIONS,
				Aadlv3Factory.eINSTANCE.createAssignment()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == Aadlv3Package.Literals.BEHAVIOR_RULE__CURRENT_STATE
				|| childFeature == Aadlv3Package.Literals.BEHAVIOR_RULE__TARGET_STATE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
