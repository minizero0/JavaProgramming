package SsangYong220825;

public class TrimTest {
//trim() ==> 문자열의 앞 뒤 공백을 없애준다. 
	public static void main(String[] args) {
		String data = "     hello      ";
		
		System.out.println(data);
		System.out.println(data.length());
		System.out.println(data.trim());		//공백을 제거한 새로운 문자열 반환.
		System.out.println(data.trim().length());		
	}

}
