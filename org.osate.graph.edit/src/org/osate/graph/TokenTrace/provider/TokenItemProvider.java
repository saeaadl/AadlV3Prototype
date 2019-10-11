/**
 */
package org.osate.graph.TokenTrace.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.provider.MultiLiteralConstraintItemProvider;
import org.osate.av3instance.av3instance.Av3instanceFactory;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTraceFactory;
import org.osate.graph.TokenTrace.TokenTracePackage;
import org.osate.graph.TokenTrace.TokenType;

/**
 * This is the item provider adapter for a {@link org.osate.graph.TokenTrace.Token} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenItemProvider 
	extends MultiLiteralConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
			addTokensPropertyDescriptor(object);
			addTokenTypePropertyDescriptor(object);
			addRelatedInstanceObjectPropertyDescriptor(object);
			addRelatedLiteralPropertyDescriptor(object);
			addLiteralSinkPropertyDescriptor(object);
			addReferenceCountPropertyDescriptor(object);
			addAssignedProbabilityPropertyDescriptor(object);
			addComputedProbabilityPropertyDescriptor(object);
			addScalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_name_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_message_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_message_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tokens feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokensPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_tokens_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_tokens_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__TOKENS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Token Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokenTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_tokenType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_tokenType_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__TOKEN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Instance Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedInstanceObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_relatedInstanceObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_relatedInstanceObject_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__RELATED_INSTANCE_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_relatedLiteral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_relatedLiteral_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__RELATED_LITERAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Literal Sink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiteralSinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_literalSink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_literalSink_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__LITERAL_SINK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Token_referenceCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_referenceCount_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__REFERENCE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Token_assignedProbability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_assignedProbability_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__ASSIGNED_PROBABILITY,
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
				 getString("_UI_Token_computedProbability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_computedProbability_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__COMPUTED_PROBABILITY,
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
				 getString("_UI_Token_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Token_scale_feature", "_UI_Token_type"),
				 TokenTracePackage.Literals.TOKEN__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Token.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Token ev = (Token) object;
		if (ev.getTokenType() == TokenType.SYSTEM) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
		}
		if (ev.getTokenType() == TokenType.COMPONENT) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
		}
		if (ev.getTokenType() == TokenType.BASIC) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicTokenBW"));
		}
		if (ev.getTokenType() == TokenType.UNDEVELOPED) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/UndevelopedTokenBW"));
		}
		if (ev.getTokenType() == TokenType.EXTERNAL) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ExternalTokenBW"));
		}
		if (ev.getTokens().size() == 1) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/IntermediateTokenBW"));
		}
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Token"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Token)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Token_type") :
			getString("_UI_Token_type") + " " + label;
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

		switch (notification.getFeatureID(Token.class)) {
			case TokenTracePackage.TOKEN__NAME:
			case TokenTracePackage.TOKEN__MESSAGE:
			case TokenTracePackage.TOKEN__TOKEN_TYPE:
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
			case TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY:
			case TokenTracePackage.TOKEN__COMPUTED_PROBABILITY:
			case TokenTracePackage.TOKEN__SCALE:
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

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.ECOLLECTION__ELEMENTS,
				 TokenTraceFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(Aadlv3Package.Literals.ECOLLECTION__ELEMENTS,
				 Av3instanceFactory.eINSTANCE.createConstrainedInstanceObject()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TokenTraceEditPlugin.INSTANCE;
	}

}
