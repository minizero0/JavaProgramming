/*
 * 5명의 점수를 입력받아 모두 출력하고 총점과 평점을 구하여 출력 해봅시다. 
 
 */

package SsangYong220816;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		for (int i = 0; i< score.length; i++)
			System.out.print((i+1) + " ");
		System.out.println();
		
		for (int i = 0; i< score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + sum/score.length);
	}
}
