package states;

import main.Operation;

public abstract class States {

	public void create(Operation op) {

	}

	public void insert_cups(Operation op) {

	}

	public void coin(Operation op) {

	}

	public void card(Operation op) {

	}

	public void cancel(Operation op) {

	}

	public void set_price(Operation op) {

	}

	public void dispose_drink(int d, Operation op, boolean[] Additive) {

	}

	public void additive() {

	}

	public int getID() {
		return 0;
	}
}
