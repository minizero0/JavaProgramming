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
	public String getKey() {
		return key;
	}
}

public class Homework01_3 {

	public static void main(String[] args) {
		ArrayList<Gen> ar = new ArrayList<Gen>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			ar.add(new Gen(key, 1));
		}
		
		Iterator<String> iter = ar.get
		
		
	}

}
