package chapter3Problem;

public class DoWhileTest {

	public static void main(String[] args) {
		int sum =0;
		int n =0;
		do{
			sum+=n;
			n+=2;
		}
		while(n<100);
		System.out.println(sum);
	}

}
