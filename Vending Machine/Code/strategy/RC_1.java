package strategy;

import main.Operation;

public class RC_1 extends returnCoin {

	@Override
	public void returnCoin(int i, Operation op) {
		// TODO Auto-generated method stub
		if (i == 1) {
			int nCoin = op.getDs().getCf();
			System.out.println("Return Coin(" + nCoin + ")");
		} else if (i == 0) {
			System.out.println("Return Coin(" + op.getDs().getTemp_v() + ")");
		} else {
			int nCoin = op.getDs().getCf() - op.getDs().getPrice();
			if (nCoin > 0) {
				System.out.println("Return Coin(" + nCoin + ")");
			}
		}

	}

}
