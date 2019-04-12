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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadlv3.aadlv3.provider.NamedElementItemProvider;

import org.osate.emv3.emv3.CompositeState;
import org.osate.emv3.emv3.Emv3Factory;
import org.osate.emv3.emv3.Emv3Package;

/**
 * This is the item provider adapter for a {@link org.osate.emv3.emv3.CompositeState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeStateItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStateItemProvider(AdapterFactory adapterFactory) {
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

			addOthersPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Others feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOthersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeState_others_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeState_others_feature", "_UI_CompositeState_type"),
				 Emv3Package.Literals.COMPOSITE_STATE__OTHERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeState_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeState_state_feature", "_UI_CompositeState_type"),
				 Emv3Package.Literals.COMPOSITE_STATE__STATE,
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
			childrenFeatures.add(Emv3Package.Literals.COMPOSITE_STATE__CONDITION);
			childrenFeatures.add(Emv3Package.Literals.COMPOSITE_STATE__TYPED_TOKEN);
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
	 * This returns CompositeState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeState)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeState_type") :
			getString("_UI_CompositeState_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeState.class)) {
			case Emv3Package.COMPOSITE_STATE__OTHERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Emv3Package.COMPOSITE_STATE__CONDITION:
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
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
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createOrmoreExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createOrlessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__CONDITION,
				 Emv3Factory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.COMPOSITE_STATE__TYPED_TOKEN,
				 Emv3Factory.eINSTANCE.createTypeSet()));
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
