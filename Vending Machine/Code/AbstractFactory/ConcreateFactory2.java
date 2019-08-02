package AbstractFactory;

import main.DS_2;
import main.DataStore;
import strategy.*;

//ConcreateFactory for VM_2
public class ConcreateFactory2 implements AbstractFactory {

	@Override
	public storePrice getStorePrice() {
		SP_2 sp = new SP_2();
		return sp;
	}

	@Override
	public zeroCF getZeroCF() {
		// TODO Auto-generated method stub
		ZF_2 zf = new ZF_2();
		return zf;
	}

	@Override
	public increaseCF getIncreaseCF() {
		// TODO Auto-generated method stub
		IF_2 icf = new IF_2();
		return icf;
	}

	@Override
	public returnCoin getRectrunCoin() {
		// TODO Auto-generated method stub
		RC_2 rc = new RC_2();
		return rc;
	}

	@Override
	public disposeDrink getDisposeDrink() {
		// TODO Auto-generated method stub
		DD_2 dd = new DD_2();
		return dd;
	}

	@Override
	public disposeAdditive getDisposeAdditive() {
		// TODO Auto-generated method stub
		DA_2 da = new DA_2();
		return da;
	}

	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		DS_2 ds = new DS_2();
		return ds;
	}

}
