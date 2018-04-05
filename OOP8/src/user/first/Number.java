package user.first;

public class Number {
	
	double limit= 0.001;
	private double num;
	
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public Number(double num) {
		super();
		this.num = num;
	}
	
	public boolean withinLimit(double number) {
		if (Math.abs(num-number)<limit) {
			return true;
		} else return false;
	}
	
}
