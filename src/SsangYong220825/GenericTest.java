package SsangYong220825;

class MyData{
	int data;
	public void SetData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		MyData me = new MyData();
		me.SetData(5);
		int a = me.getData();
		System.out.println(a);
	}

}
