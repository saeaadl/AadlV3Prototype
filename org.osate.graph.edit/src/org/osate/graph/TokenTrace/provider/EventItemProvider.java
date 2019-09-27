/**
 */
package org.osate.graph.TokenTrace.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.graph.TokenTrace.Event;
import org.osate.graph.TokenTrace.EventType;
import org.osate.graph.TokenTrace.TokenTracePackage;

/**
 * This is the item provider adapter for a {@link org.osate.graph.TokenTrace.Event} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventItemProvider extends TokenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventItemProvider(AdapterFactory adapterFactory) {
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

			addAssignedProbabilityPropertyDescriptor(object);
			addComputedProbabilityPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addScalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assigned Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_assignedProbability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_assignedProbability_feature", "_UI_Event_type"),
				 TokenTracePackage.Literals.EVENT__ASSIGNED_PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computed Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputedProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_computedProbability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_computedProbability_feature", "_UI_Event_type"),
				 TokenTracePackage.Literals.EVENT__COMPUTED_PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_type_feature", "_UI_Event_type"),
				 TokenTracePackage.Literals.EVENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_scale_feature", "_UI_Event_type"),
				 TokenTracePackage.Literals.EVENT__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Event.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Event ev = (Event) object;
		if (ev.getType() == EventType.BASIC) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicEventBW"));
		}
		if (ev.getType() == EventType.UNDEVELOPED) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/UndevelopedEventBW"));
		}
		if (ev.getType() == EventType.EXTERNAL) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ExternalEventBW"));
		}
//		if (ev.getType() == EventType.INTERMEDIATE && ev.getTokens().size() < 2) {
//			return overlayImage(object, getResourceLocator().getImage("full/obj16/IntermediateEventBW"));
//		}
		if (ev.getOperator() == EOperator.ALL) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/AllOpBW"));
		}
		if (ev.getOperator() == EOperator.ANY) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/AnyOpBW"));
		}
		if (ev.getOperator() == EOperator.ONEOF) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OneOfOpBW"));
		}
		if (ev.getOperator() == EOperator.KOFN) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/KOfOpBW"));
		}
		if (ev.getOperator() == EOperator.KORLESS) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OrLessOpBW"));
		}
		if (ev.getOperator() == EOperator.KORMORE) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OrMoreOpBW"));
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Event"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Event)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Event_type") :
			getString("_UI_Event_type") + " " + label;
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

		switch (notification.getFeatureID(Event.class)) {
			case TokenTracePackage.EVENT__ASSIGNED_PROBABILITY:
			case TokenTracePackage.EVENT__COMPUTED_PROBABILITY:
			case TokenTracePackage.EVENT__TYPE:
			case TokenTracePackage.EVENT__SCALE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
