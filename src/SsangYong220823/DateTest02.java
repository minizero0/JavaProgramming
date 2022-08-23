package SsangYong220823;

import java.util.Date;

public class DateTest02 {

	public static void main(String[] args) {
		Date myDate = new Date();
		Date startDay = new Date(myDate.getYear(), myDate.getMonth(), 1);
		int day = startDay.getDay();
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(arr[startDay.getDay()] + "요일");
		System.out.println(startDay.getDay());
	}

}
