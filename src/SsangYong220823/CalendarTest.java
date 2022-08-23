package SsangYong220823;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year =today.get(Calendar.YEAR);
		System.out.println(today);
		System.out.println(year);
		System.out.println(today.get(Calendar.MONTH) + 1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(arr[today.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		System.out.println(today.FRIDAY);
	}

}
