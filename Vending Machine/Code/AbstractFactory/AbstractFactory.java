package AbstractFactory;

import main.DataStore;
import strategy.*;

//AbstractFactory interface
public interface AbstractFactory {

	public storePrice getStorePrice();

	public zeroCF getZeroCF();

	public increaseCF getIncreaseCF();

	public returnCoin getRectrunCoin();

	public disposeDrink getDisposeDrink();

	public disposeAdditive getDisposeAdditive();

	public DataStore getDataStore();

}
