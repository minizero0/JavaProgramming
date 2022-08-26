package SsangYong220826;

class IllegalScore extends Exception {
	public IllegalScore(String str) {
		super(str);
	}
}

class ProcessScore{
	public ProcessScore(int arr[]) throws IllegalScore{
		int sum = 0;
		double avg;
		for (int n : arr) {
			if (n >= 0)
				sum += n;
			else
				throw new IllegalScore(n + "은 음수입니다.");
		}
		avg = (double)sum/arr.length;
		System.out.println("평균 : " + avg);
	}
}

public class ProcessScoreTest {

	public static void main(String[] args) throws IllegalScore{
		try {
			int arr[] = {5,4,11,10,6};
			ProcessScore ps = new ProcessScore(arr);
		}catch(IllegalScore e) {
			System.out.println(e.getMessage());
		}
	}
}
