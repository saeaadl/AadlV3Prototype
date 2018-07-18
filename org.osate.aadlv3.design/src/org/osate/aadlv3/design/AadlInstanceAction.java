package org.osate.aadlv3.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.osate.av3instance.av3instance.InstanceObject;

public class AadlInstanceAction extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
//		for (EObject eo : arg0) {
//			EObject target = null;
//			if (eo instanceof DNodeSpec) {
//				DNodeSpec ds = (DNodeSpec) eo;
//				target = ds.getTarget();
//			}
//			if (eo instanceof DSemanticDiagramSpec) {
//				DSemanticDiagramSpec ds = (DSemanticDiagramSpec) eo;
//				target = ds.getTarget();
//			}
//			if (target instanceof InstanceObject) {
//				return true;
//			}
//		}
		return false;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
//		for (EObject eo : arg0) {
//			EObject target = null;
//			if (eo instanceof DNodeSpec) {
//				DNodeSpec ds = (DNodeSpec) eo;
//				target = ds.getTarget();
//			}
//			if (eo instanceof DSemanticDiagramSpec) {
//				DSemanticDiagramSpec ds = (DSemanticDiagramSpec) eo;
//				target = ds.getTarget();
//			}
//			if (target instanceof InstanceObject) {
//				perform((InstanceObject) target);
//			}
//		}
	}

	public void perform(InstanceObject io) {
	};

}
