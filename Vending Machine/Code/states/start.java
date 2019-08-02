package states;

import main.Operation;

public class start extends States {
	private int id = 0;

	@Override
	public void create(Operation op) {
		// TODO Auto-generated method stub
		op.storePrice(op);
	}

	@Override
	public int getID() {
		return this.id;
	}

}
