package SsangYong220809;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'e') 
				count++;
		}
		System.out.println(count);

	}

}
