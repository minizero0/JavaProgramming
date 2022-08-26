package SsangYong220826;

class NotFoundException extends Exception{
	public NotFoundException(String str) {
		super(str);
	}
	
}

class SearchArray {
	public SearchArray (double arr[], double value) throws NotFoundException{
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("찾고하자 하는 " + value + "는 배열의 " + (i+1) + "번째에 있습니다.");
				break;
			}
		}
		if (i == arr.length)
			throw new NotFoundException("찾고자 하는 " + value + "가 없습니다.");
	}
}

public class SearchArrayTest {
	
	public static void main(String[] args) throws NotFoundException{
//		try {
//		double data[] = {26.7, 35.8, 6.9, 7.2};
//		SearchArray sa = new SearchArray(data, 5.8);
//		}catch(NotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		double data[] = {26.7, 35.8, 6.9, 7.2};
		SearchArray sa = new SearchArray(data, 5.8);
	}

}
