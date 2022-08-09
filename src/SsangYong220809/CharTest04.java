package SsangYong220809;
//문자열 변수 data에 저장된 소문자 e는 모두 몇개 있는지 파악하여 출력
public class CharTest04 {

	public static void main(String[] args) {
		String data = "hello";
		boolean isFlag = true;
		int i = 0;
		int count = 0;
		while (isFlag) {
			char ch = data.charAt(i);
			if (ch == 'e')
				count++;
			i++;
			if (i == data.length())
				isFlag = false;
		}
		System.out.println("e의 개수는" + count + "개 입니다.");
	} 
}
