package strategy;

import main.Operation;

public class IF_1 extends increaseCF {

	@Override
	public void increaseCF(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setCf(op.getDs().getTemp_v() + op.getDs().getCf());
		System.out.println("Current Fund:"+ op.getDs().getCf());
	}

}
