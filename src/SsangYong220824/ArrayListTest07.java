package SsangYong220824;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person2("강감찬",23));
		list.add(new Person2("김신",33));
		list.add("java");
		list.add(2022);
		list.add(new Date());
		
		for (Object data : list) {
			System.out.println(data);
			if (data instanceof Person2)
				((Person2)data).sayHello();
		}
		
	}
}
