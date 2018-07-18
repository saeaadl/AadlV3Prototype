package org.osate.aadlv3.design;

import org.osate.av3instance.av3instance.InstanceObject;

public class DoubleClickSelectAction extends AadlInstanceAction {

	@Override
	public void perform(InstanceObject io) {
		Services.setSelection(io);
	}

}
