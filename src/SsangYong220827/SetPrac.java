package SsangYong220827;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member { // Member 클래스
	String name; // 필드
	String id;

	public Member(String name, String id) { // 생성자
		this.name = name; // 필드값 초기화
		this.id = id;
	}
}

public class SetPrac {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>(); // 제네릭 타입이 Member인 HashSet 생성

		set.add(new Member("토니 스타크", "ironman")); // 객체 추가
		set.add(new Member("피터 파커", "spierman")); // 객체 추가

		Iterator<Member> it = set.iterator(); // 반복자 생성

		while (it.hasNext()) {
			Member mb = it.next(); // set에 저장된 다음 객체의 참조값 저장
			
			System.out.println("아이디 : " + mb.id); // id 출력
			System.out.println("이름 : " + mb.name); // name 출력
			System.out.println("-----------------");
		}
	}
}