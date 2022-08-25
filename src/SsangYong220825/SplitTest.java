package SsangYong220825;

import java.util.StringTokenizer;

public class SplitTest {

	public static void main(String[] args) {
		String data = "hong,lee,kim,woo,jo";
		
		String arr[] = data.split(",");
		for (String s : arr)
			System.out.println(s);
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
