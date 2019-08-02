package main;

import AbstractFactory.AbstractFactory;
import AbstractFactory.ConcreateFactory2;

public class VM_2 {

	private static final int COFFEE = 3;

	private MDA_EFSM mda = new MDA_EFSM();
//	private Operation mda.getOP() = new Operation();
	private AbstractFactory cf;

	public void create(float p) {
		if (cf != null) {
			System.out.println("Cannot Recreate!");
		} else {
			cf = new ConcreateFactory2();
			mda.getOP().initAF(cf);
			mda.getOP().getDs().setTemp_fp(p);
			mda.create();
		}

	}

	public void coin(float v) {
		if (checkCreate()) {
			mda.getOP().getDs().setTemp_fv(v);
			if (mda.getOP().getDs().getFcf() + v < mda.getOP().getDs().getFprice()) {// not enough coin
				mda.coin(0);
			} else {
				mda.coin(1);// enough coin
			}
		}

	}

	public void cream() {
		if (checkCreate()) {
			mda.additive(1);
		}

	}

	public void coffee() {
		if (checkCreate()) {
			mda.dispose_drink(COFFEE);
		}

	}

	public void insert_cups(int n) {
		if (checkCreate()) {
			mda.intsert_cups(n);
		}

	}

	public void set_price(float p) {
		if (checkCreate()) {
			mda.getOP().getDs().setTemp_fp(p);
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

	public void getStatus() {
		mda.getStatus(mda.getOP(), 2);
	}
}
