package main;

import states.*;

public class MDA_EFSM {

	// init cup & additive
	private int CUPS = 0;
	private boolean[] ADDITIVE = { false, false }; // 0 as sugar, 1 as cream
	private Operation op = new Operation();

	// init states
	private start st = new start();
	private nocups nc = new nocups();
	private idle il = new idle();
	private coin_inserted ci = new coin_inserted();
	States[] sList = { st, nc, il, ci };

	// Default state is start
	States state = sList[0];

	public void create() {
//		op.initAF();
		if (state.getID() == 0) {
			state.create(op);
			state = sList[1];// change to no_cups state
		} else {
//			System.out.println("Cannot Create Now");
		}
	}

	public void intsert_cups(int n) {
		if (state.getID() == 1 || state.getID() == 2) {
			if (n <= 0) { // input error
				System.out.println("Cups cannot be or less than 0");
				return;
			} else {
				CUPS += n; // update CUPS
				System.out.println("Current cups number:" + CUPS);
				state.insert_cups(op);
				if (state.getID() == 1) { // change state to idle
					state = sList[2];
				}
			}
		} else {
			System.out.println("Cannot Insert Cups Now");
		}

	}

	public void coin(int f) {
		state.coin(op); // update CF
		if (f == 1 && state.getID() == 2) {// change state to coin_inserted
			state = sList[3];
		}
	}

	public void card() {
		state.card(op);// read user's funds
		if (state.getID() == 2) {// change state to coin_inserted
			state = sList[3];
		}
	}

	public void cancel() {
		if (state.getID() == 3) {
			state.cancel(op);
			state = sList[2];// change state to idle
			ADDITIVE[0] = false;// renew Additive
			ADDITIVE[1] = false;
		} else {
			System.out.println("Cannot Cancel Now");
		}

	}

	public void set_price() {
		if (state.getID() != 2) {
			System.out.println("Cannot Set Price Now");
		} else {
			state.set_price(op);
		}

	}

	public void dispose_drink(int d) {
		if (state.getID() == 3) {
			state.dispose_drink(d, op, ADDITIVE);
			ADDITIVE[0] = false;// renew Additive
			ADDITIVE[1] = false;
			CUPS--;// update number of cups
			if (CUPS > 0) {
				state = sList[2];// still have cups to idle
			} else {
				state = sList[1];// no more cups to no_cups state
			}
		} else {
			System.out.println("Cannot Dispose Drink Now");
		}
	}

	public void additive(int a) {
		if (state.getID() == 3) {
			if (a < 0 || a > ADDITIVE.length) {
				System.out.println("INVALID_ADDITIVE!");
			}

			ADDITIVE[a] = !ADDITIVE[a]; // button pressed

			if (a == 0) {
				System.out.println("Sugar Pressed");
			} else {
				System.out.println("Cream Pressed");
			}
		} else {
			System.out.println("Cannot Choose Additive Now");
		}

	}

	public boolean[] getADDITIVE() {
		return ADDITIVE;
	}
	
	public Operation getOP() {
		return this.op;
	}

	/*********** debug function ****************/

	// show system status
	public void getStatus(Operation op, int i) {
		if (op.getDs() == null) {
			System.out.println("Please Create First!");
			return;
		}
		System.out.println("CUPS#:" + CUPS);
		if (i == 1) {
			System.out.println("Price:" + op.getDs().getPrice());
			System.out.println("CF:" + op.getDs().getCf());
		} else {
			System.out.println("Price:" + op.getDs().getFprice());
			System.out.println("CF:" + op.getDs().getFcf());
		}

		switch (state.getID()) {
		case 0:
			System.out.println("State: start");
			break;
		case 1:
			System.out.println("State: nocups");
			break;
		case 2:
			System.out.println("State: idle");
			break;
		case 3:
			System.out.println("State: coin_inserted");
			break;
		}
		if (ADDITIVE[0]) {
			System.out.println("Sugar Added");
		}
		if (ADDITIVE[1]) {
			System.out.println("Cream Added");
		}
	}

}
