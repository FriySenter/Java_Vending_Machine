package strategy;

import main.Operation;

public class DD_2 extends disposeDrink {
	private static final int COFFEE = 3;

	@Override
	public void disposeDrink(int d, Operation op) {
		// TODO Auto-generated method stub
		if (d == COFFEE) {
			System.out.println("Coffee disposed");
		} else {
			System.out.println("INVAILD_DRINK_TYPE");
		}
	}

}
