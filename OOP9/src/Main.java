
public class Main {

	public static void main(String[] args) {
		Cuboid cuboid= new Cuboid(10,4,5);
		System.out.println(cuboid);
		Cylinder cylinder= new Cylinder(4,9);
		System.out.println(cylinder);
		
		System.out.println(cuboid.isBiggerVolumeThan(cylinder)+"\n");
		
		PrismData data=new PrismData(5);
		
		Cuboid cube= new Cuboid(4,4,4);
		data.setPrism(0, cylinder);
		data.setPrism(1, cuboid);
		data.setPrism(2, cube);
		
		for (int i = 0; i < data.getPrismCount(); i++) {
			System.out.println(data.getPrismByIndex(i));
		}
		
		System.out.println("\n"+data.getAverageVolume());
		System.out.println(data.getCylinderCount());
		
	}

}
