package chapter3;
public class CheckTime3 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=0; i<=100; i++) {
			
		
			if(i%3==0) {
				sum+=i;
				System.out.print(i+", ");
			}
			else
				continue;
		}
		System.out.println(sum);
		
		
	}

}
