package strategy;

import main.Operation;

public class IF_2 extends increaseCF {

	@Override
	public void increaseCF(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setFcf(op.getDs().getTemp_fv() + op.getDs().getFcf());
		System.out.println("Current funds:" + op.getDs().getFcf());
	}

}
