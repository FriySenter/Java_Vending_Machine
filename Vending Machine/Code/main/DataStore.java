package main;

//DataStore interface
public interface DataStore {

	public int getTemp_p();

	public void setTemp_p(int temp_p);

	public float getTemp_fp();

	public void setTemp_fp(float temp_p);

	public int getTemp_v();

	public void setTemp_v(int temp_v);

	public float getTemp_fv();

	public void setTemp_fv(float temp_v);

	public float getTemp_x();

	public void setTemp_x(float temp_x);

	public int getPrice();

	public void setPrice(int price);

	public float getFprice();

	public void setFprice(float price);

	public int getCf();

	public void setCf(int cf);

	public float getFcf();

	public void setFcf(float cf);

}
