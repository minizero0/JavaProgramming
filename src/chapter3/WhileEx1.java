package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i =0;
		int sum=0;
		do {
			i++;
			sum+=i;
		}
		while(i<5);
		System.out.println(sum);
		
		do {
			i++;
			sum+=i;
		}while(i<10);
		System.out.println(sum);
	}
	

}
