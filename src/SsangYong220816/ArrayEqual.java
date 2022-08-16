package SsangYong220816;
public class ArrayEqual {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6,7};
		int []b = {1,2,3,4,5};
		boolean isFlag = true;
		
		if(a.length != b.length) {
			isFlag = false;
		}
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					isFlag = false;
					break;
				}
			}
		}
		System.out.println(isFlag);
		
		if (a==b)
			System.out.println("SAME");
		else
			System.out.println("DIFF");
	}
}