package SsangYong220819;

class Employee{
	protected String name;
	protected String code;
	
	Employee(String name, String code){
		this.name = name;
		this.code = code;
	}
	Employee(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
