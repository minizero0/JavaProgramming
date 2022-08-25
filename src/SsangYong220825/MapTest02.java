package SsangYong220825;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();
		map1.put("apple", "사과");
		map1.put("grape", "포도");
		map1.put("girl", "소녀");
		while (true) {
			System.out.println("1 : 추가, 2 : 검색, 3 : 삭제, 4 : 출력,  0 : 종료");
			int n = sc.nextInt();
			String s1, s2;
		
			switch(n) {
				case 1:
					System.out.println("단어를 입력하세요");
					s1 = sc.next();
					System.out.println("설명을 입력하세요.");
					s2 = sc.next();
					map1.put(s1, s2);
					break;
				case 2:
					System.out.println("찾을 단어를 입력하세요");
					s1 = sc.next();
					if (map1.get(s1) == null)
						System.out.println("찾고자 하는 단어는 없습니다.");
					else
						System.out.println(map1.get(s1));
					break;
				case 3:
					System.out.println("삭제할 단어를 입력하세요");
					s1 = sc.next();
					System.out.println(map1.remove(s1));
				case 4:
					System.out.println(map1);
				case 0: break;
			}
			if (n == 0)
				break;
		}
		System.out.println("사전 프로그램 종료");

	}

}
