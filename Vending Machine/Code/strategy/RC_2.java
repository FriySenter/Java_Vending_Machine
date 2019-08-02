package strategy;

import main.Operation;

public class RC_2 extends returnCoin {

	@Override
	public void returnCoin(int i, Operation op) {
		// TODO Auto-generated method stub
		if (i == 1) {
			float nCoin = op.getDs().getFcf();
			System.out.println("Return Coin(" + nCoin + ")");
		} else if (i == 0) {
			System.out.println("Return Coin(" + op.getDs().getTemp_fv() + ")");
		} else {
			float nCoin = op.getDs().getFcf() - op.getDs().getFprice();
			if (nCoin > 0) {
				System.out.println("Return Coin(" + nCoin + ")");
			}
		}

	}

}
