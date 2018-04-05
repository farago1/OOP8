package myproducts;

public class Product {

		private String name;
		private int cost;
		private int tax;
		
		public Product(String name, int cost, int tax) {
			super();
			this.name = name;
			this.cost = cost;
			this.tax = tax;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		
		
		public String toString() {
			return "name= " + name + ", cost= " + cost + ", tax= " + tax;
		}

		public int getRealCost() {
			return (int) this.cost*(1+this.tax/100);
		}
		public String getNameAndCost () {
			return this.name + " " + this.getRealCost();
		}
		public void increaseCost(int increase) {
			this.cost= this.cost*(1+increase/100);
		}
		public int relation(Product product) {
			if (this.getCost()>product.getCost()) {
				return 1;
		} else if (this.getCost()<product.getCost()) {
				return -1;
		} else return 0;

	}
}
