package chapter2;
import java.util.Scanner;
public class input3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int time = sc.nextInt();
		int second=time % 60;
		int miniute=(time/60)%60;
		int hour = ((time/60)/60)%60;
		System.out.println(hour + "시간" + miniute + "분" + second + "초");
				}

}
