package org.osate.av3instance.av3instance.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class LatencyRecordAdapter extends AdapterImpl implements LatencyRecord {
	protected double latency;  


	@Override
	public void setLatency(double prob) {
		latency = prob;
	}

	@Override
	public double getLatency() {
		return latency;
	}

	@Override
	public void reset() {
		latency = 0;
	}



}
