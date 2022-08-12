package SsangYong220812;

public class PerfectNumber { //1~1000까지의 완전수 출력 
	//완전수 : 자기자신을 제외한 약수의 합이 자신과 같은 수를 말한다.
	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) 
					sum += j;
			} 
			if (sum == i)
				System.out.println(i + " ");
		}
	}
}