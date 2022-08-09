package SsangYong220809;
import java.util.Scanner;

public class TeamProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		double arr[] = new double[5];
		
		System.out.print("첫번째 수를 입력하시오 ==>");
		a = sc.nextDouble();
		System.out.print("두번째 수를 입력하시오 ==>");
		b = sc.nextDouble();
		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = a / b;
		arr[3] = a * b;
		arr[4] = a % b;
		System.out.println(arr.length);
		
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					double temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = arr[j];
				}
			}
		}
		for (int i = 0; i< arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.printf("최대값: %.1f\n", arr[arr.length-1]);
		System.out.printf("최소값: %.1f", arr[0]);
		
		
		
		
		
	}

}
