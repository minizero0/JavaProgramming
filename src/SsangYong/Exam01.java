package SsangYong;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,width,height,volume;
		System.out.println("박스 길이>>");
		length = sc.nextInt();
		System.out.println("박스 너비>>");
		width = sc.nextInt();
		System.out.println("박스 높이>>");
		height = sc.nextInt();
		volume = length * width * height;
		System.out.println("박수의 부피는 = " + volume);

	}

}
