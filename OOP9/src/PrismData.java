
public class PrismData {

	Prism [] prismArray;
	
	public PrismData(int n) {
		super();
		prismArray= new Prism[n];
	}
	
	public int getPrismCount() {
		return prismArray.length;
	}
	
	public void setPrism(int index, Prism prism) {
		prismArray[index]=prism;
	}

	public Prism[] getPrismArray() {
		return prismArray;
	}
	
	public Prism getPrismByIndex(int index) {
		return prismArray[index];
	}
	
	public int getNotNull() {
		int nn=0;
		for (int i = 0; i < prismArray.length; i++) {
			if (prismArray[i] != null) {
				++nn;
			}
		}
		return nn;
	}

	public double getAverageVolume() {
		double sum=0;
		for (int i = 0; i < prismArray.length; i++) {
				if (prismArray[i]!= null) {
					sum= sum+prismArray[i].getVolume();
				}
			}
		return sum/getNotNull();
	}
	
	public int getCylinderCount() {
		int n=0;
		for (int i = 0; i < prismArray.length; i++) {
			if (prismArray[i] instanceof Cylinder) {
				n++;
			}
		}
		return n;
	}
	
}
