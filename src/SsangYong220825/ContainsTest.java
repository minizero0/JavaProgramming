package SsangYong220825;

public class ContainsTest {
//contains ==> 찾고자하는 문자열이 있으면 boolean 타입으로 반환
	public static void main(String[] args) {
		String data = "hello java";
		boolean isFlag = data.contains("java");
		System.out.println(isFlag);
		
		String data2 = "hello oracle";
		boolean isFlag2 = data2.contains("java");
		System.out.println(isFlag2);
		
		String data3 = "hello java hello korea";
		boolean isFlag3 = data3.contains("java");
		System.out.println(isFlag3);
	}

}
