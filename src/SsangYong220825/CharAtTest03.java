package SsangYong220825;
//String에 o는 모두 몇개있는지 확인
public class CharAtTest03 {

	public static void main(String[] args) {
		String data = "hello korea";
		int cnt = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'o')
				cnt++;
		}
		System.out.println(cnt);

	}

}
