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

import org.osate.aadlv3.aadlv3.util.Aadlv3AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadlv3ItemProviderAdapterFactory extends Aadlv3AdapterFactory
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
	public Aadlv3ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PackageDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDeclarationItemProvider packageDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PackageDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageDeclarationAdapter() {
		if (packageDeclarationItemProvider == null) {
			packageDeclarationItemProvider = new PackageDeclarationItemProvider(this);
		}

		return packageDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PropertyDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDefinitionItemProvider propertyDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyDefinitionAdapter() {
		if (propertyDefinitionItemProvider == null) {
			propertyDefinitionItemProvider = new PropertyDefinitionItemProvider(this);
		}

		return propertyDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PropertySet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySetItemProvider propertySetItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PropertySet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertySetAdapter() {
		if (propertySetItemProvider == null) {
			propertySetItemProvider = new PropertySetItemProvider(this);
		}

		return propertySetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ComponentInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceItemProvider componentInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInterfaceAdapter() {
		if (componentInterfaceItemProvider == null) {
			componentInterfaceItemProvider = new ComponentInterfaceItemProvider(this);
		}

		return componentInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ComponentImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationItemProvider componentImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ComponentImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentImplementationAdapter() {
		if (componentImplementationItemProvider == null) {
			componentImplementationItemProvider = new ComponentImplementationItemProvider(this);
		}

		return componentImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ComponentConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationItemProvider componentConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ComponentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentConfigurationAdapter() {
		if (componentConfigurationItemProvider == null) {
			componentConfigurationItemProvider = new ComponentConfigurationItemProvider(this);
		}

		return componentConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Import} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportItemProvider importItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportAdapter() {
		if (importItemProvider == null) {
			importItemProvider = new ImportItemProvider(this);
		}

		return importItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ModelElementReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementReferenceItemProvider modelElementReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ModelElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementReferenceAdapter() {
		if (modelElementReferenceItemProvider == null) {
			modelElementReferenceItemProvider = new ModelElementReferenceItemProvider(this);
		}

		return modelElementReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ConfigurationParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationParameterItemProvider configurationParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ConfigurationParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationParameterAdapter() {
		if (configurationParameterItemProvider == null) {
			configurationParameterItemProvider = new ConfigurationParameterItemProvider(this);
		}

		return configurationParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.TypeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceItemProvider typeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeReferenceAdapter() {
		if (typeReferenceItemProvider == null) {
			typeReferenceItemProvider = new TypeReferenceItemProvider(this);
		}

		return typeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ConfigurationActual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationActualItemProvider configurationActualItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ConfigurationActual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationActualAdapter() {
		if (configurationActualItemProvider == null) {
			configurationActualItemProvider = new ConfigurationActualItemProvider(this);
		}

		return configurationActualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Workingset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkingsetItemProvider workingsetItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Workingset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkingsetAdapter() {
		if (workingsetItemProvider == null) {
			workingsetItemProvider = new WorkingsetItemProvider(this);
		}

		return workingsetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PropertyValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValueItemProvider propertyValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyValueAdapter() {
		if (propertyValueItemProvider == null) {
			propertyValueItemProvider = new PropertyValueItemProvider(this);
		}

		return propertyValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PropertyAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAssociationItemProvider propertyAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAssociationAdapter() {
		if (propertyAssociationItemProvider == null) {
			propertyAssociationItemProvider = new PropertyAssociationItemProvider(this);
		}

		return propertyAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.Mode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeItemProvider modeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeAdapter() {
		if (modeItemProvider == null) {
			modeItemProvider = new ModeItemProvider(this);
		}

		return modeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ModeTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionItemProvider modeTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ModeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeTransitionAdapter() {
		if (modeTransitionItemProvider == null) {
			modeTransitionItemProvider = new ModeTransitionItemProvider(this);
		}

		return modeTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionTriggerAssignmentItemProvider modeTransitionTriggerAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeTransitionTriggerAssignmentAdapter() {
		if (modeTransitionTriggerAssignmentItemProvider == null) {
			modeTransitionTriggerAssignmentItemProvider = new ModeTransitionTriggerAssignmentItemProvider(this);
		}

		return modeTransitionTriggerAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ModeAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeAssignmentItemProvider modeAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ModeAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeAssignmentAdapter() {
		if (modeAssignmentItemProvider == null) {
			modeAssignmentItemProvider = new ModeAssignmentItemProvider(this);
		}

		return modeAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ModeStateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeStateMachineItemProvider modeStateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ModeStateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeStateMachineAdapter() {
		if (modeStateMachineItemProvider == null) {
			modeStateMachineItemProvider = new ModeStateMachineItemProvider(this);
		}

		return modeStateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.AnnexSubclause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnexSubclauseItemProvider annexSubclauseItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnexSubclauseAdapter() {
		if (annexSubclauseItemProvider == null) {
			annexSubclauseItemProvider = new AnnexSubclauseItemProvider(this);
		}

		return annexSubclauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.AnnexElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnexElementItemProvider annexElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.AnnexElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnexElementAdapter() {
		if (annexElementItemProvider == null) {
			annexElementItemProvider = new AnnexElementItemProvider(this);
		}

		return annexElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.TypeSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSetItemProvider typeSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.TypeSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeSetAdapter() {
		if (typeSetItemProvider == null) {
			typeSetItemProvider = new TypeSetItemProvider(this);
		}

		return typeSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PathElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathElementItemProvider pathElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathElementAdapter() {
		if (pathElementItemProvider == null) {
			pathElementItemProvider = new PathElementItemProvider(this);
		}

		return pathElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ClassifierAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierAssignmentItemProvider classifierAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ClassifierAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierAssignmentAdapter() {
		if (classifierAssignmentItemProvider == null) {
			classifierAssignmentItemProvider = new ClassifierAssignmentItemProvider(this);
		}

		return classifierAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierAssignmentPatternItemProvider classifierAssignmentPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierAssignmentPatternAdapter() {
		if (classifierAssignmentPatternItemProvider == null) {
			classifierAssignmentPatternItemProvider = new ClassifierAssignmentPatternItemProvider(this);
		}

		return classifierAssignmentPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.aadlv3.aadlv3.PathSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathSequenceItemProvider pathSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathSequenceAdapter() {
		if (pathSequenceItemProvider == null) {
			pathSequenceItemProvider = new PathSequenceItemProvider(this);
		}

		return pathSequenceItemProvider;
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
		if (packageDeclarationItemProvider != null)
			packageDeclarationItemProvider.dispose();
		if (propertyDefinitionItemProvider != null)
			propertyDefinitionItemProvider.dispose();
		if (propertySetItemProvider != null)
			propertySetItemProvider.dispose();
		if (dataTypeItemProvider != null)
			dataTypeItemProvider.dispose();
		if (componentInterfaceItemProvider != null)
			componentInterfaceItemProvider.dispose();
		if (componentImplementationItemProvider != null)
			componentImplementationItemProvider.dispose();
		if (componentConfigurationItemProvider != null)
			componentConfigurationItemProvider.dispose();
		if (featureItemProvider != null)
			featureItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (importItemProvider != null)
			importItemProvider.dispose();
		if (associationItemProvider != null)
			associationItemProvider.dispose();
		if (pathSequenceItemProvider != null)
			pathSequenceItemProvider.dispose();
		if (pathElementItemProvider != null)
			pathElementItemProvider.dispose();
		if (classifierAssignmentItemProvider != null)
			classifierAssignmentItemProvider.dispose();
		if (classifierAssignmentPatternItemProvider != null)
			classifierAssignmentPatternItemProvider.dispose();
		if (modelElementReferenceItemProvider != null)
			modelElementReferenceItemProvider.dispose();
		if (configurationParameterItemProvider != null)
			configurationParameterItemProvider.dispose();
		if (typeReferenceItemProvider != null)
			typeReferenceItemProvider.dispose();
		if (configurationActualItemProvider != null)
			configurationActualItemProvider.dispose();
		if (workingsetItemProvider != null)
			workingsetItemProvider.dispose();
		if (propertyValueItemProvider != null)
			propertyValueItemProvider.dispose();
		if (propertyAssociationItemProvider != null)
			propertyAssociationItemProvider.dispose();
		if (modeItemProvider != null)
			modeItemProvider.dispose();
		if (modeTransitionItemProvider != null)
			modeTransitionItemProvider.dispose();
		if (modeTransitionTriggerAssignmentItemProvider != null)
			modeTransitionTriggerAssignmentItemProvider.dispose();
		if (modeAssignmentItemProvider != null)
			modeAssignmentItemProvider.dispose();
		if (modeStateMachineItemProvider != null)
			modeStateMachineItemProvider.dispose();
		if (annexSubclauseItemProvider != null)
			annexSubclauseItemProvider.dispose();
		if (annexElementItemProvider != null)
			annexElementItemProvider.dispose();
		if (typeSetItemProvider != null)
			typeSetItemProvider.dispose();
	}

}
