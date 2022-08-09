package SsangYong;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		int hour, minutes;
		
		hour = input / 3600;
		input %= 3600;
		minutes = input / 60;
		input %= 60;
		
		
		System.out.println(hour + "시간" + minutes + "분" + input + "초");
		

	}

}
