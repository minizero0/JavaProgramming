package SsangYong220819;

import java.util.Scanner;

abstract class Employee{
	protected String name;
	protected String code;
	protected int total;
	abstract public void computeSalary();
	
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
	}
	public String toString() {
		return "사원이름 : " + name + ", 사원번호 : " + code + ", 호봉 : " + level + ", 기본급 : " + base
				+ ", 수당 : " + sudang + ", 실수령액 : " + total;
	}

}
class HourlyEmployee extends Employee{
	private int hour;
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(String name, String code, int hour) {
		super(name,code);
		this.hour = hour;
		
	}
	public void computeSalary(){
		int row = 10;
		total = hour * row;
	}
	public String toString() {
		return "사원이름 : " + name + ", 사원번호 : " + code + ", 근무시간 :" + hour + ", 실수령액 : " + total;
	}
}

public class EmployeeTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[3];
		int type,level, base,hour;
		String name, eno;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("사원 종류 입력[1.월급, 2.시간]");
			type = sc.nextInt();
			System.out.println("사원 이름 입력");
			name = sc.next();
			System.out.println("사원 번호 입력");
			eno = sc.next();
			switch(type) {
				case 1:System.out.println("호봉 입력.");
					level = sc.nextInt();
					arr[i] = new SalariedEmployee(name, eno, level);
					break;
				case 2:
					System.out.println("시간입력.");
					hour = sc.nextInt();
					arr[i] = new HourlyEmployee(name, eno, hour);
					break;
			}
			arr[i].computeSalary();
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
