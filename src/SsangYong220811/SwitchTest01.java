package SsangYong220811;

public class SwitchTest01 {

	public static void main(String[] args) {
		int n = 1;
		switch (n){
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
			default : 
				System.out.println("손을 내세요");
		}

	}

}
