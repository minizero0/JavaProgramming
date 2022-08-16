package SsangYong220816;

public class TeamExam {
	
	public static double findMax(double []arr) {
		double max = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	
	public static void main(String[] args) {
		double arr[] = {1.1, 2.3, 5.6, 10.2, 5.3, 30};
		System.out.println("가장 큰 수는 : " + findMax(arr));
	}

}
