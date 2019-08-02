package main;

//DataStore for VM_2
public class DS_2 implements DataStore {

	private float temp_p;
	private float temp_v;
	private float price;
	private float cf;

	@Override
	public float getTemp_fp() {
		return temp_p;
	}

	@Override
	public void setTemp_fp(float temp_p) {
		this.temp_p = temp_p;
	}

	@Override
	public float getTemp_fv() {
		return temp_v;
	}

	@Override
	public void setTemp_fv(float temp_v) {
		this.temp_v = temp_v;
	}

	@Override
	public float getFprice() {
		return price;
	}

	@Override
	public void setFprice(float price) {
		this.price = price;
	}

	@Override
	public float getFcf() {
		return cf;
	}

	@Override
	public void setFcf(float cf) {
		this.cf = cf;
	}

	@Override
	public int getTemp_p() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_p(int temp_p) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getTemp_x() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_x(float temp_x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCf(int cf) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTemp_v() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_v(int temp_v) {
		// TODO Auto-generated method stub
		
	}

}
