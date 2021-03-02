package models;

public class PeopleSpec {
	private int tall;
	private int age;
	
	public PeopleSpec() {
		
	}
	public PeopleSpec(int tall, int age) {
		this.tall = tall;
		this.age = age;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PeopleSpec [tall=" + tall + ", age=" + age + "]";
	}
	
	
	
	

}
