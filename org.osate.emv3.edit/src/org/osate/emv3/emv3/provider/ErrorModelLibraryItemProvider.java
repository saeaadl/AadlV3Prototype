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

import org.osate.aadlv3.aadlv3.Aadlv3Package;

import org.osate.aadlv3.aadlv3.provider.PackageDeclarationItemProvider;

import org.osate.emv3.emv3.Emv3Factory;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorModelLibrary;

/**
 * This is the item provider adapter for a {@link org.osate.emv3.emv3.ErrorModelLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelLibraryItemProvider extends PackageDeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelLibraryItemProvider(AdapterFactory adapterFactory) {
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
			addExtendsPropertyDescriptor(object);
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
				 getString("_UI_ErrorModelLibrary_useTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelLibrary_useTypes_feature", "_UI_ErrorModelLibrary_type"),
				 Emv3Package.Literals.ERROR_MODEL_LIBRARY__USE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelLibrary_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelLibrary_extends_feature", "_UI_ErrorModelLibrary_type"),
				 Emv3Package.Literals.ERROR_MODEL_LIBRARY__EXTENDS,
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
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPES);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPESETS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_LIBRARY__BEHAVIORS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_LIBRARY__MAPPINGS);
			childrenFeatures.add(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TRANSFORMATIONS);
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
	 * This returns ErrorModelLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorModelLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ErrorModelLibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorModelLibrary_type") :
			getString("_UI_ErrorModelLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(ErrorModelLibrary.class)) {
			case Emv3Package.ERROR_MODEL_LIBRARY__TYPES:
			case Emv3Package.ERROR_MODEL_LIBRARY__TYPESETS:
			case Emv3Package.ERROR_MODEL_LIBRARY__BEHAVIORS:
			case Emv3Package.ERROR_MODEL_LIBRARY__MAPPINGS:
			case Emv3Package.ERROR_MODEL_LIBRARY__TRANSFORMATIONS:
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
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createErrorModelSubclause()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createErrorModelLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createErrorTypes()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createErrorType()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createTypeTransformationSet()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS,
				 Emv3Factory.eINSTANCE.createTypeMappingSet()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPES,
				 Emv3Factory.eINSTANCE.createErrorType()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPESETS,
				 Emv3Factory.eINSTANCE.createTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_LIBRARY__BEHAVIORS,
				 Emv3Factory.eINSTANCE.createErrorBehaviorStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_LIBRARY__MAPPINGS,
				 Emv3Factory.eINSTANCE.createTypeMappingSet()));

		newChildDescriptors.add
			(createChildParameter
				(Emv3Package.Literals.ERROR_MODEL_LIBRARY__TRANSFORMATIONS,
				 Emv3Factory.eINSTANCE.createTypeTransformationSet()));
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
			childFeature == Aadlv3Package.Literals.PACKAGE_DECLARATION__ELEMENTS ||
			childFeature == Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPES ||
			childFeature == Emv3Package.Literals.ERROR_MODEL_LIBRARY__TYPESETS ||
			childFeature == Emv3Package.Literals.ERROR_MODEL_LIBRARY__TRANSFORMATIONS ||
			childFeature == Emv3Package.Literals.ERROR_MODEL_LIBRARY__MAPPINGS;

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
