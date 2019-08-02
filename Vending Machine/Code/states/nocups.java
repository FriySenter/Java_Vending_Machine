package states;

import main.Operation;

public class nocups extends States {
	private int id = 1;

	
	
	@Override
	public void insert_cups(Operation op) {
		op.zeroCF(op);
	}

	@Override
	public void coin(Operation op) {
		op.returnCoin(0, op);
	}

	@Override
	public int getID() {
		return this.id;
	}

}
