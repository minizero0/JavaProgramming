package SsangYong220825;

public class IndexOfTest {

	//indexOf(String str) ==>  찾고자하는 단어가 나오는 첫번째 위치를 int형으로 return  존재하지않으면 -1 
	public static void main(String[] args) {
		String data = "hello java hello korea";
		int a = data.indexOf("java");
		int b = data.indexOf("oracle");
		System.out.println(a);
		System.out.println(b);

	}

}
