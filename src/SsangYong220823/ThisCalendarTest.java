package SsangYong220823;

import java.util.Calendar;

public class ThisCalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("***" + today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월" + "***");
		
		
		
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%-4s",arr[i]);
		System.out.printf("\n-----------------------------------------\n");
		
		today.set(Calendar.DATE, 1);
		int day = today.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i < day; i++)
			System.out.printf("%5c", ' ');
		
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%-5d",i);
			if ((i+day-1) % 7 == 0)
				System.out.println();
			
		}
	}
}