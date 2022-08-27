package SsangYong220827;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Gen{
	private String key;
	private int value;
	public Gen(String key, int value) {
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return key + " " + value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getKey() {
		return key;
	}
}

public class Homework01_3 {

	public static void main(String[] args) {
		ArrayList<Gen> ar = new ArrayList<Gen>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			ar.add(new Gen(key, 1));
		}
		
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i+1; j <ar.size(); j++) {
				if (ar.get(i).getKey().equals(ar.get(j).getKey())) {
					ar.remove(j);
					ar.get(i).setValue(ar.get(i).getValue()+1);
				}
			}
		}
		
		for (int i = 0; i < ar.size(); i++) {
			String key = ar.get(i).getKey();
			int value = ar.get(i).getValue();
			
			System.out.println(key + " ==> " + value);
			
					
		}
		
		
		
		
	}

}
