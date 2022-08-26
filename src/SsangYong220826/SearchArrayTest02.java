package SsangYong220826;

class NotFoundException1 extends Exception{
	public NotFoundException1(String str) {
		super(str);
	}
	
}

class SearchArray1 {
	public SearchArray1 (double arr[], double value) throws NotFoundException1{
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("찾고하자 하는 " + value + "는 배열의 " + (i+1) + "번째에 있습니다.");
				break;
			}
		}
		if (i == arr.length)
			throw new NotFoundException1("찾고자 하는 " + value + "가 없습니다.");
	}
}

public class SearchArrayTest02 {
	
	public static void main(String[] args) {
		try {
		double data[] = {26.7, 35.8, 6.9, 7.2};
		SearchArray sa = new SearchArray(data, 5.8);
		}catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}
//		double data[] = {26.7, 35.8, 6.9, 7.2};
//		SearchArray1 sa = new SearchArray1(data, 5.8);
	}

}
