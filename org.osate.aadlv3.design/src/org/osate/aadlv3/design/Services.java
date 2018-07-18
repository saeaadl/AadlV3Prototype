package org.osate.aadlv3.design;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.PathInstance;
import static org.osate.aadlv3.util.Aadlv3Util.*;

/**
 * The services class used by VSM.
 */
public class Services {
    

	public List<ComponentInstance> getAllComponents(ComponentInstance root) {
		return EcoreUtil2.eAllOfType(root, ComponentInstance.class);
	}


	public boolean isLeafComponent(ComponentInstance ci) {
		return ci.getSubcomponents().isEmpty();
	}


	public List<AssociationInstance> getAllConnections(ComponentInstance root) {
		// TODO filter out actual connections
		List<AssociationInstance> assis = EcoreUtil2.eAllOfType(root, AssociationInstance.class);
		return assis;
	}
	

	public boolean noHardwware(InstanceObject io) {
		return !isHardware(io);
	}

	public boolean isHardware(InstanceObject io) {
		if (io instanceof ComponentInstance) {
			return isHardwareComponent((ComponentInstance) io);
		}
		if (io instanceof FeatureInstance) {
			return isHardwareFeature((FeatureInstance) io);
		}
		if (io instanceof AssociationInstance) {
			return isHardwareConnection((AssociationInstance) io);
		}
		return false;
	}

	public boolean isHardwareComponent(ComponentInstance io) {
		return (isProcessor(io) || isMemory(io) || isBus(io));
	}

	public boolean isHardwareFeature(FeatureInstance io) {
		return (isBusAccess(io));
	}

	public boolean isHardwareConnection(AssociationInstance io) {
		return (io.getAssociationType() == AssociationType.BUSCONNECTION);
	}


	public boolean isSystem(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.SYSTEM);
	}

	public boolean isAbstract(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.COMPONENT);
	}

	public boolean isThreadGroup(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.THREADGROUP);
	}

	public boolean isProcess(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.PROCESS);
	}

	public boolean isThread(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.THREAD);
	}

	public boolean isMemory(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.MEMORY);
	}

	public boolean isDevice(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.DEVICE);
	}

	public boolean isProcessor(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.PROCESSOR);
	}

	public boolean isBus(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.BUS);
	}

	public boolean isVirtualBus(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.VIRTUALBUS);
	}

	public boolean isVirtualProcessor(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.VIRTUALPROCESSOR);
	}

	public boolean isData(ComponentInstance eo) {
		return (eo.getCategory() == ComponentCategory.DATA);
	}

	public boolean isBusAccess(FeatureInstance eo) {
		return (eo.getCategory() == FeatureCategory.BUSACCESS);
	}

	static String selected;
	static InstanceObject io;

	static public void setSelection(InstanceObject eo) {
		String target = getInstanceObjectPath(eo);
		if (selected != null && selected.equals(target)) {
			selected = null;
			io = null;
		} else {
			selected = getInstanceObjectPath(eo);
			io = eo;
		}
		Session session = SessionManager.INSTANCE.getSession(eo); // the semantic EObject
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		Command cmd = new RefreshRepresentationsCommand(domain, null, allRepresentations); // view.getOwnedRepresentations()
		domain.getCommandStack().execute(cmd);
	}

	static public boolean isSelection(InstanceObject eo) {
		return (selected != null && selected.equals(getInstanceObjectPath(eo)));
	}

	static public boolean isETEFElement(InstanceObject eo) {
		if (io instanceof PathInstance) {
			PathInstance etefi = (PathInstance) io;
			for (InstanceObject efel : etefi.getElements()) {
				if (efel == eo) {
					return true;
				}
				if (isFlowSpec(efel)) {
					if (efel.eContainer() == eo) {
						return true;
					}
				}
			}

		}
		return false;
	}

}
