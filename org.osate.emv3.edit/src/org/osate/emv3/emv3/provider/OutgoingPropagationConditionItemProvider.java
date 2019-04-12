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

import org.osate.emv3.emv3.Emv3Factory;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.OutgoingPropagationCondition;

/**
 * This is the item provider adapter for a {@link org.osate.emv3.emv3.OutgoingPropagationCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutgoingPropagationConditionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingPropagationConditionItemProvider(AdapterFactory adapterFactory) {
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

			addStatePropertyDescriptor(object);
			addAllStatesPropertyDescriptor(object);
			addOutgoingPropertyDescriptor(object);
			addAllPropagationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_OutgoingPropagationCondition_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingPropagationCondition_state_feature", "_UI_OutgoingPropagationCondition_type"),
				 Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutgoingPropagationCondition_allStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingPropagationCondition_allStates_feature", "_UI_OutgoingPropagationCondition_type"),
				 Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__ALL_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutgoingPropagationCondition_outgoing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingPropagationCondition_outgoing_feature", "_UI_OutgoingPropagationCondition_type"),
				 Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__OUTGOING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Propagations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllPropagationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutgoingPropagationCondition_allPropagations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingPropagationCondition_allPropagations_feature", "_UI_OutgoingPropagationCondition_type"),
				 Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT);
			childrenFeatures.add(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION);
			childrenFeatures.add(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN);
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
	 * This returns OutgoingPropagationCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutgoingPropagationCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OutgoingPropagationCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OutgoingPropagationCondition_type") :
			getString("_UI_OutgoingPropagationCondition_type") + " " + label;
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

		switch (notification.getFeatureID(OutgoingPropagationCondition.class)) {
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION__ALL_STATES:
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT:
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION__CONDITION:
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN:
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
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT,
				 Emv3Factory.eINSTANCE.createTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createOrmoreExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createOrlessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__CONDITION,
				 Emv3Factory.eINSTANCE.createAllExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN,
				 Emv3Factory.eINSTANCE.createTypeSet()));
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

		boolean qualify =
			childFeature == Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT ||
			childFeature == Emv3Package.Literals.OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
