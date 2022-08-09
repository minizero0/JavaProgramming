package SsangYong220809;

public class CharTest03 {

	public static void main(String[] args) {
		String data = "hello";
		boolean isFlag = true;
		int i = 0;
		while (isFlag) {
			char ch = data.charAt(i);
			System.out.print(ch);
			i++;
			if (i == data.length())
				isFlag = false;
		}

	}

}
