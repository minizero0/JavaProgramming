package SsangYong220823;

import java.util.Calendar;

public class CalendarTest02 {

	public static void main(String[] args) {
		//Calendar를 이용하여 이번달의 1일의 요일 출력
		Calendar today = Calendar.getInstance();
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		int year = today.get(Calendar.YEAR);
		today.set(Calendar.DATE, 1);
		int week = today.get(Calendar.DAY_OF_WEEK);
	
		System.out.println(arr[week-1] + "요일");
		

	}

}
