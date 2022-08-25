package SsangYong220825;

public class ValueOfTest {

	//ValueofTest ==> String.ValueOf(Type variable) String 타입으로 변환시켜준다. 
	public static void pro(String data) {
		System.out.println("처리된 데이터: " + data);
	}
	public static void main(String[] args) {
		boolean isFlag = true;
		int age = 20;
		double height = 182.9;
		char ch = 'K';
		
		pro(String.valueOf(isFlag));
		pro(String.valueOf(age));
		pro(String.valueOf(height));
		pro(String.valueOf(ch));
		
		pro(isFlag + "");  // 이렇게 간단한 방법으로도 String 으로 변환가능.
		pro(age + "");
		pro(height + "");
		pro(ch + "");
		
		

	}

}
