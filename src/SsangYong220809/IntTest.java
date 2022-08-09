package SsangYong220809;

public class IntTest {

	public static void main(String[] args) {
		
//		long input = System.currentTimeMillis();
//		long hour, minutes;
//		
//		long day = input / (3600 * 12);
//		input %= (3600*12);
//		hour = input / 3600;
//		input %= 3600;
//		minutes = input / 60;
//		input %= 60;
//		
//		
//		System.out.println(day + "일" + hour + "시간" + minutes + "분" + input + "초");
		
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		int n ;
		n = (int)(now % 10);
		System.out.println(n);
		

		
//		byte data;
//		data = 127;
//		data += 1;
//		System.out.println(data);
//	
//		byte data2 = -128;
//		data2 -= 1;
//		System.out.println(data2);
	}

}
