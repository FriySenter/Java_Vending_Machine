package main;

//DataStore for VM_1
public class DS_1 implements DataStore {

	private int temp_p;
	private int temp_v;
	private float temp_x;
	private int price;
	private int cf;

	@Override
	public int getTemp_p() {
		return temp_p;
	}

	@Override
	public void setTemp_p(int temp_p) {
		this.temp_p = temp_p;
	}

	@Override
	public float getTemp_x() {
		return temp_x;
	}

	@Override
	public void setTemp_x(float temp_x) {
		this.temp_x = temp_x;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getCf() {
		return cf;
	}

	@Override
	public void setCf(int cf) {
		this.cf = cf;
	}

	@Override
	public int getTemp_v() {
		return temp_v;
	}

	@Override
	public void setTemp_v(int temp_v) {
		this.temp_v = temp_v;
	}

	@Override
	public float getTemp_fp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_fp(float temp_p) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getFprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFprice(float price) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getFcf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFcf(float cf) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getTemp_fv() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_fv(float temp_v) {
		// TODO Auto-generated method stub

	}

}
