package SsangYong220826;

import java.util.StringTokenizer;

class IlleagalArgumentException extends Exception{
	public IlleagalArgumentException(String str) {
		super(str);
	}
}

class MyDate{
	
	public MyDate(String today) throws IlleagalArgumentException {
		if (today == null)
			throw new IlleagalArgumentException("문자열이" + today + " 입니다.");
		StringTokenizer st = new StringTokenizer(today, "/");
		String year,month,day;
		
		year = st.nextToken();
		month = st.nextToken();
		day = st.nextToken();
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}

public class TeamExam01 {

	public static void main(String[] args) {
		try {
		MyDate md = new MyDate("2022/12/12");
		MyDate md2 = new MyDate(null);
		}catch(IlleagalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
