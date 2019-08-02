package main;

import AbstractFactory.AbstractFactory;
import strategy.*;

public class Operation {
	private storePrice sp;
	private zeroCF zf;
	private increaseCF icf;
	private returnCoin rc;
	private disposeDrink dd;
	private disposeAdditive da;
	private DataStore ds;

	public void initAF(AbstractFactory cf) {
		sp = cf.getStorePrice();
		zf = cf.getZeroCF();
		icf = cf.getIncreaseCF();
		rc = cf.getRectrunCoin();
		dd = cf.getDisposeDrink();
		da = cf.getDisposeAdditive();
		ds = cf.getDataStore();
	}

	public void storePrice(Operation op) {
		sp.storePrice(op);
	}

	public void zeroCF(Operation op) {
		zf.zeroCF(op);
	}

	public void increaseCF(Operation op) {
		icf.increaseCF(op);
		
	}

	public void returnCoin(int i, Operation op) {
		rc.returnCoin(i, op);
	}

	public void disposeDrink(int d, Operation op) {
		dd.disposeDrink(d, op);
	}

	public void disposeAdditive(boolean[] Additive) {
		da.disposeAdditive(Additive);
	}

	public storePrice getSp() {
		return sp;
	}

	public zeroCF getZf() {
		return zf;
	}

	public increaseCF getIcf() {
		return icf;
	}

	public returnCoin getRc() {
		return rc;
	}

	public disposeDrink getDd() {
		return dd;
	}

	public disposeAdditive getDa() {
		return da;
	}

	public DataStore getDs() {
		return ds;
	}

}
