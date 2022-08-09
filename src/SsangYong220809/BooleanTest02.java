package SsangYong220809;
import java.util.Scanner;
public class BooleanTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		boolean isFlag = false;
//		if (age == 20)
//			isFlag = true;
//		else
//			isFlag = false;
		isFlag = age >= 20;
		System.out.println(isFlag);

	}

}
