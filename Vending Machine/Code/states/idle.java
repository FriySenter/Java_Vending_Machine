package states;

import main.Operation;

public class idle extends States {
	private int id = 2;

	@Override
	public void card(Operation op) {
		op.zeroCF(op);
	}

	@Override
	public void coin(Operation op) {
		op.increaseCF(op);
	}

	@Override
	public void set_price(Operation op) {
		op.storePrice(op);
	}

	@Override
	public void insert_cups(Operation op) {
		// do nothing
	}

	@Override
	public int getID() {
		return this.id;
	}
}
