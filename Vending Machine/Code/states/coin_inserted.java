package states;

import main.Operation;

public class coin_inserted extends States {
	private int id = 3;

	@Override
	public void coin(Operation op) {
		op.returnCoin(0, op);
	}

	@Override
	public void cancel(Operation op) {
		op.returnCoin(1, op);
		op.zeroCF(op);
	}

	@Override
	public void dispose_drink(int d, Operation op, boolean[] Additive) {
		op.disposeDrink(d, op);
		op.disposeAdditive(Additive);
		op.returnCoin(3, op);
		op.zeroCF(op);
	}

	@Override
	public int getID() {
		return this.id;
	}

}
