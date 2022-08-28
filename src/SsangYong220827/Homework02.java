package SsangYong220827;

import java.util.ArrayList;
import java.util.Iterator;

class Super{
	String name;
	int	age;
	
	public Super(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Homework02 {

	public static void main(String[] args) {
		ArrayList<Super> ar = new ArrayList<Super>();
		
		ar.add(new Super("tony", 45));
		ar.add(new Super("parker", 25));
		
		Iterator<Super> iter = ar.iterator();
		
		while(iter.hasNext()) {
			
		}

	}

}
