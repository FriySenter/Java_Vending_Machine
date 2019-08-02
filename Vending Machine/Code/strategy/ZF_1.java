package strategy;

import main.Operation;

public class ZF_1 extends zeroCF {

	@Override
	public void zeroCF(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setCf(0);
	}

}
