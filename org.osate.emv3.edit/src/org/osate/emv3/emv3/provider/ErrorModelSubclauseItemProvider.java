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

import org.osate.aadlv3.aadlv3.provider.PackageElementItemProvider;

import org.osate.emv3.emv3.Emv3Factory;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorModelSubclause;

/**
 * This is the item provider adapter for a {@link org.osate.emv3.emv3.ErrorModelSubclause} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelSubclauseItemProvider extends PackageElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelSubclauseItemProvider(AdapterFactory adapterFactory) {
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
			addTypeEquivalencePropertyDescriptor(object);
			addTypeMappingSetPropertyDescriptor(object);
			addUseBehaviorPropertyDescriptor(object);
			addUseTransformationPropertyDescriptor(object);
			addTypeTransformationSetPropertyDescriptor(object);
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
				 getString("_UI_ErrorModelSubclause_useTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_useTypes_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__USE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Equivalence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeEquivalencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelSubclause_typeEquivalence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_typeEquivalence_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__TYPE_EQUIVALENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Mapping Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeMappingSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelSubclause_typeMappingSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_typeMappingSet_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__TYPE_MAPPING_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelSubclause_useBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_useBehavior_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__USE_BEHAVIOR,
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
				 getString("_UI_ErrorModelSubclause_useTransformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_useTransformation_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__USE_TRANSFORMATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Transformation Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeTransformationSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelSubclause_typeTransformationSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelSubclause_typeTransformationSet_feature", "_UI_ErrorModelSubclause_type"),
				 Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__TYPE_TRANSFORMATION_SET,
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
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__PROPAGATIONS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__EVENTS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__TRANSITIONS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__STATES);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__POINTS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__PATHS);
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
	 * This returns ErrorModelSubclause.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorModelSubclause"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ErrorModelSubclause)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorModelSubclause_type") :
			getString("_UI_ErrorModelSubclause_type") + " " + label;
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

		switch (notification.getFeatureID(ErrorModelSubclause.class)) {
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__PROPAGATIONS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__FLOWS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__EVENTS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__TRANSITIONS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__STATES:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__POINTS:
			case Emv3Package.ERROR_MODEL_SUBCLAUSE__PATHS:
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
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__PROPAGATIONS,
				 Emv3Factory.eINSTANCE.createErrorPropagation()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS,
				 Emv3Factory.eINSTANCE.createErrorFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS,
				 Emv3Factory.eINSTANCE.createErrorSource()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS,
				 Emv3Factory.eINSTANCE.createErrorSink()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS,
				 Emv3Factory.eINSTANCE.createErrorPath()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__EVENTS,
				 Emv3Factory.eINSTANCE.createErrorBehaviorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__EVENTS,
				 Emv3Factory.eINSTANCE.createErrorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__EVENTS,
				 Emv3Factory.eINSTANCE.createRepairEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__EVENTS,
				 Emv3Factory.eINSTANCE.createRecoverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__TRANSITIONS,
				 Emv3Factory.eINSTANCE.createErrorBehaviorTransition()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS,
				 Emv3Factory.eINSTANCE.createOutgoingPropagationCondition()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS,
				 Emv3Factory.eINSTANCE.createErrorDetection()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS,
				 Emv3Factory.eINSTANCE.createErrorStateToModeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__STATES,
				 Emv3Factory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES,
				 Emv3Factory.eINSTANCE.createErrorSource()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__POINTS,
				 Emv3Factory.eINSTANCE.createPropagationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__PATHS,
				 Emv3Factory.eINSTANCE.createPropagationPath()));
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
			childFeature == Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__FLOWS ||
			childFeature == Emv3Package.Literals.ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES;

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
