package AbstractFactory;

import main.DS_1;
import main.DataStore;
import strategy.*;


//ConcreateFactory for VM_1
public class ConcreateFactory1 implements AbstractFactory {

	@Override
	public storePrice getStorePrice() {
		SP_1 sp = new SP_1();
		return sp;
	}

	@Override
	public zeroCF getZeroCF() {
		// TODO Auto-generated method stub
		ZF_1 zf = new ZF_1();
		return zf;
	}

	@Override
	public increaseCF getIncreaseCF() {
		// TODO Auto-generated method stub
		IF_1 if1 = new IF_1();
		return if1;
	}

	@Override
	public returnCoin getRectrunCoin() {
		// TODO Auto-generated method stub

		RC_1 rc = new RC_1();
		return rc;
	}

	@Override
	public disposeDrink getDisposeDrink() {
		// TODO Auto-generated method stub

		DD_1 dd = new DD_1();
		return dd;
	}

	@Override
	public disposeAdditive getDisposeAdditive() {
		// TODO Auto-generated method stub
		DA_1 da = new DA_1();
		return da;
	}

	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		DS_1 ds = new DS_1();
		return ds;
	}

}
