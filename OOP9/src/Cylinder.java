
public class Cylinder extends Prism {

	private double radius;
	
	public Cylinder(double radius, int height) {
		super(height);
		this.radius= radius;
		}
	
	public double getBaseArea() {
		return radius*radius*Math.PI;
	}

	public String toString() {
		return "Cylinder [radius=" + radius + ", getBaseArea()=" + getBaseArea() + ", getHeight()=" + getHeight() + ", getVolume()=" + getVolume() + "]";
	}

	
	
	
	
}
