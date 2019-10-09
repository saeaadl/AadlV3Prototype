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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.osate.av3instance.av3instance.util.Av3instanceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Av3instanceItemProviderAdapterFactory extends Av3instanceAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Av3instanceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.FeatureInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureInstanceItemProvider featureInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureInstanceAdapter() {
		if (featureInstanceItemProvider == null) {
			featureInstanceItemProvider = new FeatureInstanceItemProvider(this);
		}

		return featureInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.ComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceItemProvider componentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new ComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.AssociationInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationInstanceItemProvider associationInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.AssociationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationInstanceAdapter() {
		if (associationInstanceItemProvider == null) {
			associationInstanceItemProvider = new AssociationInstanceItemProvider(this);
		}

		return associationInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.PathInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathInstanceItemProvider pathInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.PathInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathInstanceAdapter() {
		if (pathInstanceItemProvider == null) {
			pathInstanceItemProvider = new PathInstanceItemProvider(this);
		}

		return pathInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.BehaviorRuleInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorRuleInstanceItemProvider behaviorRuleInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.BehaviorRuleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorRuleInstanceAdapter() {
		if (behaviorRuleInstanceItemProvider == null) {
			behaviorRuleInstanceItemProvider = new BehaviorRuleInstanceItemProvider(this);
		}

		return behaviorRuleInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.GeneratorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorInstanceItemProvider generatorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.GeneratorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorInstanceAdapter() {
		if (generatorInstanceItemProvider == null) {
			generatorInstanceItemProvider = new GeneratorInstanceItemProvider(this);
		}

		return generatorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.ConstrainedInstanceObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedInstanceObjectItemProvider constrainedInstanceObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.ConstrainedInstanceObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstrainedInstanceObjectAdapter() {
		if (constrainedInstanceObjectItemProvider == null) {
			constrainedInstanceObjectItemProvider = new ConstrainedInstanceObjectItemProvider(this);
		}

		return constrainedInstanceObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.StateInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateInstanceItemProvider stateInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.StateInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateInstanceAdapter() {
		if (stateInstanceItemProvider == null) {
			stateInstanceItemProvider = new StateInstanceItemProvider(this);
		}

		return stateInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.av3instance.av3instance.SinkInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkInstanceItemProvider sinkInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.av3instance.av3instance.SinkInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkInstanceAdapter() {
		if (sinkInstanceItemProvider == null) {
			sinkInstanceItemProvider = new SinkInstanceItemProvider(this);
		}

		return sinkInstanceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (featureInstanceItemProvider != null)
			featureInstanceItemProvider.dispose();
		if (componentInstanceItemProvider != null)
			componentInstanceItemProvider.dispose();
		if (associationInstanceItemProvider != null)
			associationInstanceItemProvider.dispose();
		if (pathInstanceItemProvider != null)
			pathInstanceItemProvider.dispose();
		if (behaviorRuleInstanceItemProvider != null)
			behaviorRuleInstanceItemProvider.dispose();
		if (generatorInstanceItemProvider != null)
			generatorInstanceItemProvider.dispose();
		if (constrainedInstanceObjectItemProvider != null)
			constrainedInstanceObjectItemProvider.dispose();
		if (stateInstanceItemProvider != null)
			stateInstanceItemProvider.dispose();
		if (sinkInstanceItemProvider != null)
			sinkInstanceItemProvider.dispose();
	}

}
