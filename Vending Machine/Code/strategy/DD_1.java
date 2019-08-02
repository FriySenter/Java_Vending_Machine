package strategy;

import main.Operation;

public class DD_1 extends disposeDrink {
	private static final int TEA = 0;
	private static final int CHOCOLATE = 1;

	@Override
	public void disposeDrink(int d, Operation op) {
		// TODO Auto-generated method stub
		if (d == TEA) {
			System.out.println("Tea disposed");
		} else if (d == CHOCOLATE) {
			System.out.println("Chocolate disposed");
		} else {
			System.out.println("INVAILD_DRINK_TYPE");
		}
	}

}
