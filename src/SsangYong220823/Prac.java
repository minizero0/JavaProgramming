package SsangYong220823;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String name2 = sc.next();
		
		if (name.equals(name2))
			System.out.println("correct");
	}
}