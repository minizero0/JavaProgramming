package SsangYong220825;

public class StringBufferTest {

	public static void main(String[] args) {
		String s = "hello";
		
		byte arr[] = s.getBytes();
		System.out.println(arr.length);

		
		for (byte a : arr)
			System.out.println((char)a);

	}

}
