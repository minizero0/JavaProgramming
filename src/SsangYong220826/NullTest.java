package SsangYong220826;

public class NullTest {

	public static void main(String[] args) throws NullPointerException{
		String data = "hello";
		System.out.println(data.charAt(0));
		try {
			String data2 = null;
			System.out.println(data2.charAt(0));
		}catch(NullPointerException e) {
			System.out.println("data2 가 null임 ");
		}
		
	}

}
