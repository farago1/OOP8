package user.second;

import user.first.Number;

public class Main {

	public static void main(String[] args) {
		final Number num= new Number(Math.random());		
//		System.out.println(num.getNum());
	
		int index=0;
		int counter=1;
		while (index==0) {
			double tempN=Math.random();
			if (num.withinLimit(tempN)) {
				index=counter;
			}
			counter++;
		}
		System.out.println(index);
		
		num.setNum(43);
//		num= new Number(12);		nope
		
	}
}
