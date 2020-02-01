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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadlv3.aadlv3.Aadlv3Factory;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ClassifierAssignment;

/**
 * This is the item provider adapter for a {@link org.osate.aadlv3.aadlv3.ClassifierAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierAssignmentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierAssignmentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__TARGET);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__FLOW_ASSIGNMENTS);
			childrenFeatures.add(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CONNECTION_ASSIGNMENTS);
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
	 * This returns ClassifierAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassifierAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ClassifierAssignment_type");
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

		switch (notification.getFeatureID(ClassifierAssignment.class)) {
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ELEMENTS:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__FLOW_ASSIGNMENTS:
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CONNECTION_ASSIGNMENTS:
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

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__TARGET,
				Aadlv3Factory.eINSTANCE.createNamedElementReference()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__TARGET,
				Aadlv3Factory.eINSTANCE.createPathElement()));

		newChildDescriptors
				.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS,
						Aadlv3Factory.eINSTANCE.createClassifierAssignment()));

		newChildDescriptors
				.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS,
						Aadlv3Factory.eINSTANCE.createClassifierAssignmentPattern()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS,
				Aadlv3Factory.eINSTANCE.createTypeReference()));

		newChildDescriptors
				.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS,
						Aadlv3Factory.eINSTANCE.createPropertyAssociation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createFeature()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createSubcomponent()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createPathSequence()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createInstanceConfiguration()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createDefaultAnnexSubclause()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createAnnotationBlock()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createStateTransition()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createStateSynchronization()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createBehavior()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createStateVariable()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS,
				Aadlv3Factory.eINSTANCE.createGenerator()));

		newChildDescriptors.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__FLOW_ASSIGNMENTS,
				Aadlv3Factory.eINSTANCE.createPathSequence()));

		newChildDescriptors
				.add(createChildParameter(Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CONNECTION_ASSIGNMENTS,
						Aadlv3Factory.eINSTANCE.createPathSequence()));
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

		boolean qualify = childFeature == Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__ELEMENTS
				|| childFeature == Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__FLOW_ASSIGNMENTS
				|| childFeature == Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT__CONNECTION_ASSIGNMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
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
		return Aadlv3EditPlugin.INSTANCE;
	}

}
