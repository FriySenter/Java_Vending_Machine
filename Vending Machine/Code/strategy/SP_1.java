package strategy;

import main.Operation;

public class SP_1 extends storePrice {

	@Override
	public void storePrice(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setPrice(op.getDs().getTemp_p());
		System.out.println("Current Price:" + op.getDs().getPrice());
	}

}

