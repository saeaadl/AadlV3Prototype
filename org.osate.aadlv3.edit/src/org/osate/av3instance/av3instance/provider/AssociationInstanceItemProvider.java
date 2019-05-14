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
package org.osate.av3instance.av3instance.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.aadlv3.util.Aadlv3Util;

/**
 * This is the item provider adapter for a {@link org.osate.av3instance.av3instance.AssociationInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationInstanceItemProvider extends InstanceObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addAssociationTypePropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addDestinationPropertyDescriptor(object);
			addSourceDelegatesPropertyDescriptor(object);
			addDestinationDelegatesPropertyDescriptor(object);
			addExternalPropertyDescriptor(object);
			addBidirectionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Association Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssociationInstance_associationType_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_AssociationInstance_associationType_feature", "_UI_AssociationInstance_type"), //$NON-NLS-1$ //$NON-NLS-2$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssociationInstance_association_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AssociationInstance_association_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AssociationInstance_type"), //$NON-NLS-1$
				Av3instancePackage.Literals.ASSOCIATION_INSTANCE__ASSOCIATION, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_AssociationInstance_source_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_AssociationInstance_source_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_AssociationInstance_type"), //$NON-NLS-1$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__SOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssociationInstance_destination_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AssociationInstance_destination_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AssociationInstance_type"), //$NON-NLS-1$
				Av3instancePackage.Literals.ASSOCIATION_INSTANCE__DESTINATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Delegates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDelegatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssociationInstance_sourceDelegates_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_AssociationInstance_sourceDelegates_feature", "_UI_AssociationInstance_type"), //$NON-NLS-1$ //$NON-NLS-2$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__SOURCE_DELEGATES, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Destination Delegates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationDelegatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssociationInstance_destinationDelegates_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_AssociationInstance_destinationDelegates_feature", "_UI_AssociationInstance_type"), //$NON-NLS-1$ //$NON-NLS-2$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__DESTINATION_DELEGATES, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bidirectional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBidirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssociationInstance_bidirectional_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_AssociationInstance_bidirectional_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_AssociationInstance_type"), //$NON-NLS-1$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__BIDIRECTIONAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssociationInstance_external_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_AssociationInstance_external_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_AssociationInstance_type"), //$NON-NLS-1$
						Av3instancePackage.Literals.ASSOCIATION_INSTANCE__EXTERNAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AssociationInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		AssociationType cat = ((AssociationInstance) object).getAssociationType();
		String prefix = (cat == AssociationType.CONNECTION )
				? (((AssociationInstance) object).isBidirectional() ? "bi" : "dir")
				: "";
		String name = "bifeatureconnection";
		if (cat != null) {
			name = prefix + cat.getLiteral().replaceAll(" ", "") + ".gif";
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/" + name)); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		AssociationInstance conni = (AssociationInstance) object;
		String label = conni.getName();
		InstanceObject src = conni.getSource();
		InstanceObject dst = conni.getDestination();
		InstanceObject conncontext = (InstanceObject) conni.eContainer();
		String srclabel = src == null ? "" : Aadlv3Util.getNamePath(src, conncontext);
		String dstlabel = dst == null ? "" : Aadlv3Util.getNamePath(dst, conncontext);
		String type = conni.getAssociationType().getLiteral();
		String connsymbol = conni.isBidirectional() ? " <-> " : "->";
		type = type.substring(0, 1).toUpperCase() + type.substring(1);
		return label == null || label.length() == 0 ? getString("_UI_AssociationInstance_type") : //$NON-NLS-1$
				type + " " + label + ": " + srclabel + connsymbol + dstlabel; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(AssociationInstance.class)) {
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE:
		case Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL:
		case Av3instancePackage.ASSOCIATION_INSTANCE__BIDIRECTIONAL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
