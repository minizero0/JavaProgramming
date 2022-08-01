package boostcamp;

public class Length_for_each {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int k : array)
			sum += k;
		System.out.println(sum);
	}

}
