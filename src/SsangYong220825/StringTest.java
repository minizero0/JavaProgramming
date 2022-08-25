package SsangYong220825;

public class StringTest {

	public static void main(String[] args) {
		String data1 = "hello";
		String data2 = new String("hello");
		String data3 = "hello";
		String data4 = new String("hello");
		
		System.out.println(data1==data2);
		System.out.println(data1==data3);
		System.out.println(data1==data4);
		System.out.println(data3==data4);
	}

}
