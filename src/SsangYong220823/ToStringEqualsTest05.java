package SsangYong220823;

//매개변수를 갖는 생성자.

class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name : " + name + " age : " +age; 
	}
	public boolean equals(Person p) {
		boolean isFlag = false;
		if (name.equals(p.name) && age == p.age)
			isFlag = true;
		return isFlag;
		
	}
}

public class ToStringEqualsTest05 {

	public static void main(String[] args) {
		Person kim = new Person("김유신", 20);
		System.out.println(kim);

		Person kim2 = new Person("김유신", 20);
		if(kim.equals(kim2))
			System.out.println("SMAE");
		else
			System.out.println("DIFF");
	}

}
