package main;

import AbstractFactory.AbstractFactory;
import AbstractFactory.ConcreateFactory1;

public class VM_1 {

	private static final int TEA = 0;
	private static final int CHOCOLATE = 1;

	private MDA_EFSM mda = new MDA_EFSM();// pointer to MDA_EFSM
//	private Operation op = new Operation();// pointer to operation
	private AbstractFactory cf;// pointer to AbstractFactory

	public void create(int p) {
		if (cf != null) {
			System.out.println("Cannot Recreate!");
		} else {
			cf = new ConcreateFactory1();// create new ConcreateFactory
			mda.getOP().initAF(cf);
			mda.getOP().getDs().setTemp_p(p);
			mda.create();
		}
	}

	public void coin(int v) {
		if (checkCreate()) {
			mda.getOP().getDs().setTemp_v(v);
			if (mda.getOP().getDs().getCf() + v < mda.getOP().getDs().getPrice()) {// not enough coin
				mda.coin(0);
			} else {
				mda.coin(1);// enough coin
			}
		}

	}

	public void card(float x) {
		if (checkCreate()) {
			mda.getOP().getDs().setTemp_x(x);
			if (x >= mda.getOP().getDs().getPrice()) {
				mda.card();
			} else {
				System.out.println("FUNDS_NOT_ENOUGH");
			}
		}

	}

	public void sugar() {
		if (checkCreate()) {
			mda.additive(0);
		}
	}

	public void tea() {
		if (checkCreate()) {
			mda.dispose_drink(TEA);
		}

	}

	public void chocolate() {
		if (checkCreate()) {
			mda.dispose_drink(CHOCOLATE);
		}
	}

	public void insert_cups(int n) {
		if (checkCreate()) {
			mda.intsert_cups(n);
		}
	}

	public void set_price(int p) {
		if (checkCreate()) {
			mda.getOP().getDs().setTemp_p(p);
			mda.set_price();
		}
	}

	public void cancel() {
		if (checkCreate()) {
			mda.cancel();
		}

	}

	private boolean checkCreate() {
		if (mda.getOP().getDs() == null) {
			System.out.println("Please Create First!");
			return false;
		} else {
			return true;
		}
	}

	// debug use
	// show system status
	public void getStatus() {
		mda.getStatus(mda.getOP(), 1);
	}
}
