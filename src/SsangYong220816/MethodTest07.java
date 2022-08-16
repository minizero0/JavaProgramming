package SsangYong220816;

public class MethodTest07 {
	//정수형 배열을 매개변수로 전달받아 총합을 구하여 출력하는 메소드를 정의
	static void sum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		sum(a);

	}

}
