package SsangYong220823;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date();
		int year = today.getYear() + 1900;
		int month = today.getMonth() + 1;  //getMonth 는 0~11 사이로 설정되어있음
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(date + "일");
		System.out.println(hours + "시");
		System.out.println(minutes + "분");
		System.out.println(seconds + "초");
		
		int day = today.getDay();
		System.out.println(day);
		String []arr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(arr[day] + "요일");

	}

}
