package SsangYong220817;

class Person{  //클래스 정의 
	private String name;
	private int age;
	public void setName(String n) {  //Setter 설정자
		name = n;
	}
	public void setAge(int n) {  //Setter 설정자
		age = n;
	}
	public String getName() {  //Getter 접근자
		return name;
	}
	public int getAge() {   //Getter 접근자
		return age;
	}
	public void eat(String food) {
		System.out.printf("%d살 %s가 %s를 먹는다.\n",age,name,food);
	}
	public void go(String anywhere) {
		System.out.printf("%d살 %s가 %s로 간다.\n",age,name,anywhere);
	}
	public int manAge(int age) {
		return age - 1;
	}
}

public class PersonTest02{

	public static void main(String[] args) {
		Person lee; 	//객체 참조변수를 선언
		lee = new Person();	//객체생성
		Person jo = new Person(); 	// 객체참조변수 선언을 동시에 객체 생성.
		
		jo.setName("yeongmin");
		jo.setAge(27);
		lee.eat("Hamburger");
		System.out.println(jo.getName());
		System.out.println(jo.getAge());
		
	}

}
