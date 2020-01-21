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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadlv3.aadlv3.Aadlv3Factory;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Behavior;

/**
 * This is the item provider adapter for a {@link org.osate.aadlv3.aadlv3.Behavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addSinkPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Behavior_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Behavior_source_feature",
								"_UI_Behavior_type"),
						Aadlv3Package.Literals.BEHAVIOR__SOURCE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Behavior_sink_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Behavior_sink_feature",
								"_UI_Behavior_type"),
						Aadlv3Package.Literals.BEHAVIOR__SINK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Behavior_category_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Behavior_category_feature",
								"_UI_Behavior_type"),
						Aadlv3Package.Literals.BEHAVIOR__CATEGORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR__CONDITION);
			childrenFeatures.add(Aadlv3Package.Literals.BEHAVIOR__ACTIONS);
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
	 * This returns Behavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Behavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Behavior) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Behavior_type")
				: getString("_UI_Behavior_type") + " " + label;
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

		switch (notification.getFeatureID(Behavior.class)) {
		case Aadlv3Package.BEHAVIOR__SOURCE:
		case Aadlv3Package.BEHAVIOR__SINK:
		case Aadlv3Package.BEHAVIOR__CATEGORY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Aadlv3Package.BEHAVIOR__CONDITION:
		case Aadlv3Package.BEHAVIOR__ACTIONS:
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

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createNamedElementReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createPathElement()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createDirectionalLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createECollection()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createListLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createSetLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createMultiOperandExpression()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createMultiLiteralConstraint()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__CONDITION,
				Aadlv3Factory.eINSTANCE.createPackageElementReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.BEHAVIOR__ACTIONS,
				Aadlv3Factory.eINSTANCE.createBinaryOperation()));
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

		boolean qualify = childFeature == Aadlv3Package.Literals.MODEL_ELEMENT__IN_STATES
				|| childFeature == Aadlv3Package.Literals.BEHAVIOR__CONDITION
				|| childFeature == Aadlv3Package.Literals.BEHAVIOR__ACTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
