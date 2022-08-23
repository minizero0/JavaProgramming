package SsangYong220823;

import java.util.Date;

public class DateTest02 {

	public static void main(String[] args) {
		Date myDate = new Date();
		int month = 6;
		Date startDay = new Date(myDate.getYear(), month, 1);
		int day = startDay.getDay();
		System.out.println(day);
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(arr[startDay.getDay()] + "요일");
		System.out.println(startDay.getDay());
	}
}