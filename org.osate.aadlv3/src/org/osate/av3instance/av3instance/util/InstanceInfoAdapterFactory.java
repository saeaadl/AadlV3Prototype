package org.osate.av3instance.av3instance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class InstanceInfoAdapterFactory extends AdapterFactoryImpl {

	public static AdapterFactory INSTANCE = new InstanceInfoAdapterFactory();

	@Override
	public Adapter createAdapter(Notifier target, Object type) {
		if (type.getClass() == TokenRecord.class) {
			return new TokenRecordAdapter();
		}
		if (type.getClass() == ProbabilityRecord.class) {
			return new ProbabilityRecordAdapter();
		}
		if (type.getClass() == LatencyRecord.class) {
			return new LatencyRecordAdapter();
		}
		return null;
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return (type == TokenRecord.class || type ==  ProbabilityRecord.class || type == LatencyRecord.class);
	}
	
	// InstanceInfoAdapterFactory.INSTANCE.adapt(fi, TokenRecord.class);

}
