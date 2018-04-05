package myproducts;

public class Main {

	public static void main(String[] args) {
		Product product= new Product("meme", 4300, 12);
		Bread bread= new Bread("BigBread", 900, 15, 3);
		System.out.println(product +"\n"+bread);
	
		Product product2= new Bread("SmallBread", 320, 15, 1);
		System.out.println(product2);
		
		Bread bread2= new Bread("MediumBread", 670, 15, 2);
// :(		
		if(Bread.isBiggerBread(bread2, product2)) {
			return bread2;
		}else return product2;
		
	}
}
