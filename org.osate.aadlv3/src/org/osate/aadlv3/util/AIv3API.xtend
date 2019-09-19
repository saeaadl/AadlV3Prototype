package org.osate.aadlv3.util

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.osate.aadlv3.aadlv3.Aadlv3Factory
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.AssociationType
import org.osate.aadlv3.aadlv3.BehaviorRule
import org.osate.aadlv3.aadlv3.ComponentCategory
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.Literal
import org.osate.aadlv3.aadlv3.ModelElement
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.PropertyDefinition
import org.osate.aadlv3.aadlv3.Subcomponent
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.Av3instanceFactory
import org.osate.av3instance.av3instance.BehaviorRuleInstance
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.ConstrainedInstanceObject
import org.osate.av3instance.av3instance.FeatureInstance
import org.osate.av3instance.av3instance.InstanceObject
import org.osate.av3instance.av3instance.PathInstance

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.osate.aadlv3.util.Aadlv3Util.*
import org.osate.av3instance.av3instance.GeneratorInstance
import org.osate.aadlv3.aadlv3.Generator
import org.osate.aadlv3.aadlv3.BehaviorSpecification
import org.osate.aadlv3.aadlv3.impl.BehaviorRuleImpl
import org.osate.aadlv3.aadlv3.StateSpecification
import org.osate.av3instance.av3instance.StateInstance
import org.osate.aadlv3.aadlv3.ConditionOperation

class AIv3API {
	
	////////////////////////////////////////
	// Instance Model methods
	///////////////////////////////////////

	def static FeatureInstance createFeatureInstance(Feature f, boolean reverse) {
		val featurei = Av3instanceFactory.eINSTANCE.createFeatureInstance
		featurei.name = f.name
		featurei.direction = if (reverse) f.direction.reverseDirection else f.direction
		featurei.feature = f
		featurei.category = f.category
		return featurei
	}

	def static PathInstance createPathSequenceInstance(PathSequence ps) {
		val psi = Av3instanceFactory.eINSTANCE.createPathInstance
		psi.name = ps.name
		psi.path = ps
		return psi
	}

	def static AssociationInstance createAssociationInstance(Association assoc) {
		val associ = Av3instanceFactory.eINSTANCE.createAssociationInstance
		associ.name = assoc.name
		associ.association = assoc
		associ.associationType = assoc.associationType
		return associ
	}

	def static ComponentInstance createComponentInstance(Subcomponent c, Iterable<TypeReference> configuredtypereferences) {
		val compi = Av3instanceFactory.eINSTANCE.createComponentInstance
		compi.name = c.name
		compi.category = c.category
		compi.component = c
		Aadlv3Util.putConfiguredTypeReferences(compi, configuredtypereferences)
		return compi
	}
	
	def static createPropertyAssociationInstance(PropertyAssociation pa){
		val pai = Aadlv3Factory.eINSTANCE.createPropertyAssociation
		pai.property = pa.property
		pai.propertyAssociation = pa
		pai.propertyAssociationType = pa.propertyAssociationType
		pai.value = pa.value.copy
		return pai
	}

	def static BehaviorRuleInstance createBehaviorRuleInstance(BehaviorRule br) {
		val bri = Av3instanceFactory.eINSTANCE.createBehaviorRuleInstance
		bri.name = br.name
		bri.behaviorRule = br
		return bri
	}
	
	def static ConstrainedInstanceObject createConstrainedInstanceObject(ConditionOperation co, ComponentInstance context) {
		val cio = Av3instanceFactory.eINSTANCE.createConstrainedInstanceObject
		cio.instanceObject = context.getInstanceElement(co.element as ModelElementReference)
		if (co.constraint !== null){
			cio.constraint = co.constraint.copy
			cio.name = cio.getInstanceObject().instanceObjectPath+":"+cio.getConstraint().toString()
		} else {
			cio.name = cio.getInstanceObject().instanceObjectPath
		}
		return cio
	}
	
	def static ConstrainedInstanceObject createConstrainedInstanceObject(ModelElementReference mer, ComponentInstance context) {
		val cio = Av3instanceFactory.eINSTANCE.createConstrainedInstanceObject
		cio.instanceObject = context.getInstanceElement(mer)
		cio.name = cio.getInstanceObject().toString()
		return cio
	}


	def static GeneratorInstance createGeneratorInstance(Generator g) {
		val gi = Av3instanceFactory.eINSTANCE.createGeneratorInstance
		gi.name = g.name
		gi.generator = g
		gi.value = g.value.copy
		return gi
	}

	def static StateInstance createStateInstance(StateSpecification ss) {
		val si = Av3instanceFactory.eINSTANCE.createStateInstance
		si.name = ss.currentState.value
		si.constraint = ss.constraint.copy
		return si
	}

	/**
	 * get the instance object pointed to my model element reference using the instance object context as root of the path
	 */
	def static InstanceObject getInstanceElement(InstanceObject context, ModelElementReference mer){
		if (mer === null || mer.element === null) return context
		val cxt = if(mer.context !== null) getInstanceElement(context, mer.context) else context
		cxt.getInstanceElement(mer.element)
	}
	
	/**
	 * get the instance object representing the model element. It is directly contained in the context object
	 */
	def static InstanceObject getInstanceElement(InstanceObject context, ModelElement me){
		switch (context){
			ComponentInstance: {
				switch (me) {
					Subcomponent: {
						for (compi : context.components) {
							if (compi.component == me) return compi
						}
					}
					Feature: {
						for (fi : context.features) {
							if (fi.feature == me) return fi
						}
					}
					Association: {
						for (conni : context.connections) {
							if (conni.association == me) return conni
						}
						for (fsi : context.flowspecs) {
							if (fsi.association == me) return fsi
						}
					}
					PathSequence: {
						for (pi : context.paths) {
							if (pi.path == me) return pi
						}
					}
					Generator: {
						for (gi : context.generators) {
							if (gi.generator == me) return gi
						}
					}
					BehaviorRule: {
						for (bri : context.behaviorRules) {
							if (bri.behaviorRule == me) return bri
						}
					}
				}
			}
			FeatureInstance: {
				for (fi : context.features) {
					if (fi.feature == me) return fi
				}
			}
		}
		context
	}
	
	/**
	 * get the model element the instance object is based on
	 */
	def static EObject getInstanceOrigin(InstanceObject io){
		switch (io){
			ComponentInstance: {
				io.component
			}
			FeatureInstance: {
				io.feature
			}
			AssociationInstance: {
				io.association
			}
			PathInstance: {
				io.path
			}
			default: { io}
		}
	}
	
	// Return the component instance if io is a component isntance (self) or the containing component isntance
	def static containingComponentInstanceOrSelf(InstanceObject io){
		var res = io
		while (!(res instanceof ComponentInstance) && res.eContainer !== null){
			res = res.eContainer as InstanceObject
		}
		res as ComponentInstance
	}
	
	// return containing component instance 
	// for component instance as input return its containing component instance
	def static containingComponentInstance(InstanceObject io){
		var res = io.eContainer
		while (!(res instanceof ComponentInstance) && res.eContainer !== null){
			res = res.eContainer as InstanceObject
		}
		res as ComponentInstance
	}
	
	/**
	 * return containing BehaviorRuleInstance
	 */
	def static containingBehaviorRuleInstance(InstanceObject io){
		var res = io
		while (!(res instanceof BehaviorRuleInstance) && res.eContainer !== null){
			res = res.eContainer as InstanceObject
		}
		res as BehaviorRuleInstance
	}
	/**
	 * get containing InstanceObject. 
	 */
	def static containingInstanceObject(InstanceObject io){
		var res = io.eContainer
		while (!(res instanceof InstanceObject) && res !== null){
			res = res.eContainer as InstanceObject
		}
		res as InstanceObject
	}

	
	// instance object has property association
	def static boolean hasPropertyAssociation(InstanceObject io, PropertyDefinition pd){
		io.ownedPropertyAssociations.exists[pai|samePropertyDefinition(pai.property, pd)]
	}
	
	def static Literal getPropertyValue(InstanceObject io, PropertyDefinition pd){
		for (pai : io.ownedPropertyAssociations){
			if (samePropertyDefinition(pai.property, pd)){
				return pai.value;
			}
		}
		return null;
	}
	
	def static Literal getPropertyValue(InstanceObject io, String pname){
		for (pai : io.ownedPropertyAssociations){
			if (samePropertyDefinition(pai.property, pname)){
				return pai.value;
			}
		}
		return null;
	}
	
		
	// association instance represents a flow specification
	def static boolean isFlowSpec(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.association.associationType.isFlowSpec 
		} else false
	}

	// association instance represents a connection
	def static boolean isConnection(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.association.isConnection 
		} else false
	}
	// association instance represents a connection
	def static boolean isBinding(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.associationType == AssociationType.BINDING 
		} else false
	}
	
	def static AssociationInstance findFlowSpecInstance(InstanceObject infi, InstanceObject outfi){
		val ci = infi.containingComponentInstance
		for (fsi : ci.flowspecs){
			if (fsi.source === infi && fsi.destination === outfi){
				return fsi
			}
		}
		null
	}

	
	def static AssociationInstance findConnectionInstance(InstanceObject srcfi, InstanceObject dstfi){
		var ci = srcfi.containingComponentInstance
		while (ci !== null){
			for (conni : ci.connections){
				if (conni.source === srcfi && conni.destination === dstfi){
					return conni
				}
			}
			ci = ci.eContainer as ComponentInstance
		}
		null
	}

	def static String getInstanceObjectPath(InstanceObject io) {
		if (io.eContainer === null) {
			if (io.getName() !== null){
				return io.getName();
			} else {
				return io.eClass.name
			}
			
		}
		val cont = io.containingInstanceObject
		val path =  cont instanceof InstanceObject? cont.instanceObjectPath: ""
		val localname = (io.getName() !== null)?io.getName():io.eClass.name;

		return if (path.empty ) localname else path + "." + localname;
	}
	

	def static List<ComponentInstance> getAllComponents(ComponentInstance root) {
		return EcoreUtil2.eAllOfType(root, ComponentInstance);
	}

	def static Iterable<ComponentInstance> getAllLeafComponents(ComponentInstance root) {
		return getAllComponents(root).filter[ci|ci.isLeafComponent];
	}


	def static boolean isLeafComponent(ComponentInstance ci) {
		return ci.getComponents().isEmpty();
	}


	def static Iterable<FeatureInstance> getAllIncomingFeatures(ComponentInstance ci) {
		return ci.features.filter[f|f.direction.incoming];
	}

	def static Iterable<FeatureInstance> getAllOutgoingFeatures(ComponentInstance ci) {
		return ci.features.filter[f|f.direction.outgoing];
	}

	def static boolean isFlowSource(FeatureInstance fi, Iterable<AssociationInstance> flows) {
		return flows.exists[f|f.source === fi];
	}

	def static boolean isFlowDestination(FeatureInstance fi, Iterable<AssociationInstance> flows) {
		return flows.exists[f|f.destination === fi];
	}


	def static List<AssociationInstance> getAllConnections(ComponentInstance root) {
		val assis = EcoreUtil2.eAllOfType(root, AssociationInstance);
		val conns = new ArrayList<AssociationInstance>();
		for (AssociationInstance ai : assis) {
			if (ai.getAssociationType() == AssociationType.CONNECTION) {
				conns.add(ai);
			}
		}
		return conns;
	}
	
	
	def static ComponentInstance getRoot(ComponentInstance ci) {
		var top = ci;
		while (top.eContainer() !== null) {
			top = top.eContainer() as ComponentInstance;
		}
		return top;
	}

	def static boolean noHardware(InstanceObject io) {
		return !isHardware(io);
	}

	def static boolean isHardware(InstanceObject io) {
		if (io instanceof ComponentInstance) {
			return isHardwareComponent(io );
		}
		if (io instanceof FeatureInstance) {
			return isHardwareFeature(io );
		}
		if (io instanceof AssociationInstance) {
			return isHardwareConnection(io );
		}
		return false;
	}

	def static boolean isHardwareComponent(ComponentInstance io) {
		return (isProcessor(io) || isMemory(io) || isBus(io)|| isDevice(io));
	}

	def static boolean isHardwareFeature(FeatureInstance io) {
		return (isBusAccess(io));
	}

	def static boolean isHardwareConnection(AssociationInstance io) {
		return (io.getAssociationType() == AssociationType.CONNECTION && isHardware(io.getDestination()));
	}


	def static boolean isSystem(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.SYSTEM);
	}

	def static boolean isAbstract(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.ABSTRACT);
	}

	def static boolean isThreadGroup(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.THREADGROUP);
	}

	def static boolean isProcess(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.PROCESS);
	}

	def static boolean isThread(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.THREAD);
	}

	def static boolean isMemory(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.MEMORY);
	}

	def static boolean isDevice(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.DEVICE);
	}

	def static boolean isProcessor(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.PROCESSOR);
	}

	def static boolean isBus(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.BUS);
	}

	def static boolean isVirtualBus(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.VIRTUALBUS);
	}

	def static boolean isVirtualProcessor(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.VIRTUALPROCESSOR);
	}

	def static boolean isData(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.DATA);
	}

	def static boolean isBusAccess(FeatureInstance eo) {
		return (eo.getCategory() == FeatureCategory.BUSACCESS);
	}
	
	// methods related to behavior rules, constrained instance objects
	
	def static Iterable<ConstrainedInstanceObject> findContainedActionCIOs(InstanceObject desiredTarget, Literal constraint, String behaviorSpecName){
		val briContext = desiredTarget.containingComponentInstanceOrSelf
		val bris = briContext.behaviorRules.filter[bri|bri.behaviorRule.containingBehaviorSpecification.name.equals(behaviorSpecName)]
		return bris.map[bri|bri.actions].flatten.filter[target|target.instanceObject === desiredTarget && constraint.contains(target.constraint)]
	}
	
	/**
	 * return all action CIOs that refer to the instance object io
	 */
	def static Iterable<ConstrainedInstanceObject> findActionCIOs(InstanceObject io, String behaviorSpecName){
		val briContext = io.containingComponentInstanceOrSelf
		val bris = briContext.behaviorRules.filter[bri|bri.behaviorRule.containingBehaviorSpecification.name.equals(behaviorSpecName)]
		return bris.map[bri|bri.actions].flatten.filter[target|target.instanceObject === io]
	}
	
	
	/**
	 * find all CIOs in condition whose instance object reference points to desriredTarget and whose constraint contains the target literal
	 */
	def static Iterable<ConstrainedInstanceObject> findContainingConditionCIOs(InstanceObject desiredTarget, Literal targetLiteral, String behaviorSpecName){
		val dstCi = containingComponentInstanceOrSelf(desiredTarget);
		val bris = dstCi.behaviorRules.filter[bri|bri.behaviorRule.containingBehaviorSpecification.name.equals(behaviorSpecName)]
		val cios = bris.map[bri|bri.condition.eAllOfType(ConstrainedInstanceObject)].flatten
		return cios.filter[target|target.instanceObject === desiredTarget && target.constraint.contains(targetLiteral)]
	}
	
	def static Iterable<ConstrainedInstanceObject> getAllConstrainedInstanceObjects(Literal lit){
		return lit.eAllOfType(ConstrainedInstanceObject)
	}
	
	def static boolean isAncestor(InstanceObject ancestor, InstanceObject descendent){
		var desc = descendent.containingInstanceObject
		while (desc !== null){
			if (desc === ancestor){
				return true
			}
			desc = desc.containingInstanceObject
		}
		return false
	}
}
