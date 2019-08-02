package strategy;

import main.Operation;

public class ZF_2 extends zeroCF {

	@Override
	public void zeroCF(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setFcf((float) 0);
	}

}
