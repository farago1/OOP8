package myproducts;

public class Bread extends Product {

	private float volume;
	public Bread(String name, int price, int tax, float volume) {
		super(name, price, tax);
		this.volume=volume;
	}
	public float getVolume() {
		return volume;
	}
	public String toString() {
		return "Bread [volume= " + volume + " " + super.toString() + "]";
	}
	public int getPricePerWeight() {
		return (int) (this.getCost()/volume);
	}
	
	public static boolean isBiggerBread(Bread b1, Bread b2) {
		if (b1.getVolume()>b2.getVolume()) {
			return true;
		}else return false;
	}
	
}

