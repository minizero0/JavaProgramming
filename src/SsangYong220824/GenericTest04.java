package SsangYong220824;

import java.util.ArrayList;

public class GenericTest04 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.2);
		list.add(1.1);
		list.add(2.5);
		list.add(3.2);
		
		double sum = 0;
		for(double data : list)
			sum += data;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/list.size());
		
	}
}