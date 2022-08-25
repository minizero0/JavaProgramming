package SsangYong220825;

public class CharAtTest02 {

	//length ==> 배열의 길이.
	//length() ==> 문자열의 길이
	//size() ==> collection의 길이
	public static void main(String[] args) {
		String data = "hello koera";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			System.out.printf("%d번째의 문자는 %c\n", i,ch);
		}
	}

}
