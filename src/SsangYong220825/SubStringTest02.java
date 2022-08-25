package SsangYong220825;

import java.util.ArrayList;

public class SubStringTest02 {

	public static void main(String[] args) {
		
		String data[] = {
				"tiger@naver.com",
				"lion@naver.com",
				"kim@naver.com",
				"lee@naver.com"
		};
		
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < data.length; i++) {
			s.add(data[i].substring(0, data[i].indexOf("@")));
		}
		
		for (String str : data){
			String id = str.substring(0, str.indexOf("@"));
			list.add(id);
		}
		System.out.println(s);
		System.out.println(list);
	}

}
