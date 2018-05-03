
public abstract class Prism {

	private int height;
	
	public Prism(int height) {
		super();
		this.height= height;
	}

	public int getHeight() {
		return height;
	}

	public abstract double getBaseArea();
	
	public double getVolume() {
		return getBaseArea()*height;
	}
	
	public boolean isBiggerVolumeThan(Prism prism) {
		if (this.getVolume()> prism.getVolume()) {
			return true;	
		} else return false;
	}
	
}
