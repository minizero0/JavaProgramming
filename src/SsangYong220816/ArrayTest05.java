package SsangYong220816;

public class ArrayTest05 {

	public static void main(String[] args) {
		String name[] = {"홍길동", "이순신", "유관순", "김유신", "강감찬"};
		
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);
		
		System.out.println("===================================");
		
		for (String s : name)
			System.out.println(s);

	}

}
