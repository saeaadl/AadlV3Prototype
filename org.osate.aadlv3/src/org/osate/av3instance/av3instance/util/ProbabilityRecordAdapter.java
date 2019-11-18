package org.osate.av3instance.av3instance.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class ProbabilityRecordAdapter extends AdapterImpl implements ProbabilityRecord {
	protected double probability;  // could be BigDecimal

	@Override
	public void setProbability(double prob) {
		probability = prob;
	}

	@Override
	public double getProbability() {
		return probability;
	}

	@Override
	public void reset() {
		probability = 0;
	}



}
