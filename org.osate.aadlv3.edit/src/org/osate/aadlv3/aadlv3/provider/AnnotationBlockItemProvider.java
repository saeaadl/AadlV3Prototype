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
import org.osate.aadlv3.aadlv3.AnnotationBlock;

/**
 * This is the item provider adapter for a {@link org.osate.aadlv3.aadlv3.AnnotationBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationBlockItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationBlockItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS);
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
	 * This returns AnnotationBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnnotationBlock) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AnnotationBlock_type")
				: getString("_UI_AnnotationBlock_type") + " " + label;
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

		switch (notification.getFeatureID(AnnotationBlock.class)) {
		case Aadlv3Package.ANNOTATION_BLOCK__ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPackageDeclaration()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPropertyDefinition()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPropertySet()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createNamedType()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createComponentInterface()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createComponentImplementation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createComponentConfiguration()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createFeature()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createSubcomponent()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPathSequence()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createConfigurationParameter()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createWorkingset()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createInstanceConfiguration()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createDefaultAnnexSubclause()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createAnnexLibrary()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createAnnotationBlock()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createStateTransition()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createBehavior()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createStateVariable()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createGenerator()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createConstant()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.ANNOTATION_BLOCK__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPackageElementReference()));
	}

}
