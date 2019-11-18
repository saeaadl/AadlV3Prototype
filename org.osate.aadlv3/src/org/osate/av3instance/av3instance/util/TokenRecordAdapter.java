package org.osate.av3instance.av3instance.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.util.Aadlv3Util;
import org.osate.aadlv3.util.Av3API;
import org.osate.av3instance.av3instance.InstanceObject;

public class TokenRecordAdapter extends AdapterImpl implements TokenRecord {
	private class TraceRecord {
		protected Literal token;
		protected Literal state;

	}

	protected TraceRecord traceRecord;


	protected Collection<TraceRecord> visited = new ArrayList<TraceRecord>();

	@Override
	public void setVisitLiteral( Literal token, Literal state) {
		this.traceRecord = new TraceRecord();
		traceRecord.state = state;
		traceRecord.token = token;
		visited.add(this.traceRecord);
	}

	@Override
	public void removeVisitedLiteral(Literal token, Literal state) {
		TraceRecord found = findTraceRecord(token, state);
		visited.remove(found);
	}


	@Override
	public boolean isAdapterForType(Object type) {
		return type == TokenRecord.class;
	}

	@Override
	public void reset() {
		traceRecord = null;
		visited.clear();
	}
	
//	
//	// clear error model state objects in all objects contained in root
//	public static void unsetAll(InstanceObject root) {
//		List<InstanceObject> it = EcoreUtil2.getAllContentsOfType(root, InstanceObject.class);
//		for (InstanceObject io : it) {
//			ErrorModelState st = (ErrorModelState) ErrorModelStateAdapterFactory.INSTANCE.adapt(io,
//					ErrorModelState.class);
//			st.unsetAll();
//		}
//	}
//
//	// remove error model state objects in all objects contained in root
//	public static void removeAll(InstanceObject root) {
//		TreeIterator<Object> it = EcoreUtil.getAllContents(root, false);
//		while (it.hasNext()) {
//			InstanceObject io = (InstanceObject) it.next();
//			Adapter st = ErrorModelStateAdapterFactory.INSTANCE.adapt(io, ErrorModelState.class);
//			Notifier notifier = st.getTarget();
//			notifier.eAdapters().remove(st);
//			st.setTarget(null);
//		}
//	}



	@Override
	public boolean visited(Literal token, Literal state) {
		return findTraceRecord(token, state) != null;
	}

	private TraceRecord findTraceRecord(Literal token, Literal state) {
		for (TraceRecord tr : visited) {
			if (((state == null&& tr.state == null)  || state.sameAs(tr.state)) && ((token == null&& tr.token == null)  || token.sameAs(tr.token))) {
				return tr;
			}
		}
		return null;
	}


}
