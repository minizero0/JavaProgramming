package boostcamp;

public class Chap3_pro13 {

	public static void main(String[] args) {
		
		
		int a = 1;
		while (a < 100) {
			int count = 0;
			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9){
				count++;
			}
			if (a / 10 == 3 || a / 10 == 6 || a / 10 == 9){
				count++;
			}
			if (count == 1)
				System.out.println(a + " 박수 짝");
			if (count == 2)
				System.out.println(a + " 박수 짝짝");
			a++;
		}

	}

}
