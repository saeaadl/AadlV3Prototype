/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadlv3.aadlv3.provider.NamedElementItemProvider;

import org.osate.emv3.emv3.Emv3Factory;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorBehaviorStateMachine;

/**
 * This is the item provider adapter for a {@link org.osate.emv3.emv3.ErrorBehaviorStateMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorBehaviorStateMachineItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorStateMachineItemProvider(AdapterFactory adapterFactory) {
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

			addUseTypesPropertyDescriptor(object);
			addUseTransformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Use Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorBehaviorStateMachine_useTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorBehaviorStateMachine_useTypes_feature", "_UI_ErrorBehaviorStateMachine_type"),
				 Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Transformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseTransformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorBehaviorStateMachine_useTransformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorBehaviorStateMachine_useTransformation_feature", "_UI_ErrorBehaviorStateMachine_type"),
				 Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__STATES);
			childrenFeatures.add(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS);
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
	 * This returns ErrorBehaviorStateMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorBehaviorStateMachine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ErrorBehaviorStateMachine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorBehaviorStateMachine_type") :
			getString("_UI_ErrorBehaviorStateMachine_type") + " " + label;
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

		switch (notification.getFeatureID(ErrorBehaviorStateMachine.class)) {
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
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

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS,
				 Emv3Factory.eINSTANCE.createErrorBehaviorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS,
				 Emv3Factory.eINSTANCE.createErrorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS,
				 Emv3Factory.eINSTANCE.createRepairEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS,
				 Emv3Factory.eINSTANCE.createRecoverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__STATES,
				 Emv3Factory.eINSTANCE.createErrorBehaviorState()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS,
				 Emv3Factory.eINSTANCE.createErrorBehaviorTransition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Emv3EditPlugin.INSTANCE;
	}

}
