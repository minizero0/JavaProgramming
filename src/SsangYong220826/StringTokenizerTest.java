package SsangYong220826;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String data = "행복:건강:돈:가족";
		StringTokenizer st = new StringTokenizer(data, ":");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println(st.countTokens());
	}

}
