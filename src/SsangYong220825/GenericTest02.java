package SsangYong220825;

class MyData1<T>{
	T data;
	public void SetData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}

public class GenericTest02 {

	public static void main(String[] args) {
		MyData1<String> me = new MyData1<String>();
		me.SetData("5");
		String a = me.getData();
		System.out.println(a);
		
		MyData1<Double> md = new MyData1();
		md.SetData(5.1);
		double v2 = md.getData();
		System.out.println(v2);
	}

}
