package SsangYong220823;

import java.util.Calendar;
import java.util.GregorianCalendar;

// GregorianCalendar를 이용하여 
// 오늘 날짜와 시간을 출력.

public class GregorianCalendarTest {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print(today.get(GregorianCalendar.YEAR) + "년 ");
		System.out.print(today.get(GregorianCalendar.MONTH) + 1 + "월 ");
		System.out.print(arr[today.get(GregorianCalendar.DAY_OF_WEEK) - 1] + "요일 ");
		System.out.println(today.get(GregorianCalendar.HOUR) + "시 ");

		if (today.isLeapYear(today.get(GregorianCalendar.YEAR)))
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다.");
	}
}