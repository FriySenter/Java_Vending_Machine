package strategy;

import main.Operation;

public class SP_2 extends storePrice {

	@Override
	public void storePrice(Operation op) {
		// TODO Auto-generated method stub
		op.getDs().setFprice(op.getDs().getTemp_fp());
		System.out.println("Current Price:" + op.getDs().getFprice());
	}

}
