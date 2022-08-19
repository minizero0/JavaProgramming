package SsangYong220819;

class Employee{
	protected String name;
	protected String code;
	protected int total;
	
	Employee(String name, String code){
		this.name = name;
		this.code = code;
	}
	Employee(){
		
	}
	protected void computeSalarty() {
		
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

class SalariedEmployee extends Employee{
	private int level;	//호봉
	private int base;	//기본급
	private int sudang;	//수당
	
	public SalariedEmployee() {
	}
	public SalariedEmployee(String name, String code, int level) {
		super(name,code);
		this.level = level;
	}
	public void computeSalary(){ //재정의 MethodOverriding
		switch(level) {
			case 1:base=1000;sudang=100;break;
			case 2:base=800;sudang=80;break;
			case 3:base=6000;sudang=600;break;
		}
		total = base + sudang;
		System.out.println("사원이름 : " + name + ", 사원번호 : " + code + ", 호봉 : " + level + ", 기본급 : " + base
				+ ", 수당 : " + sudang + ", 실수령액 : " + total);
	}

}
class HourlyEmployee extends Employee{
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(String name, String code) {
		super(name,code);
		
	}
	public void computeSalary(){
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		SalariedEmployee s1 = new SalariedEmployee("cavin", "n12", 1);
		s1.computeSalary();

	}

}
