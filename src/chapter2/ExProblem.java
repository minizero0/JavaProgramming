package chapter2;
import java.util.Scanner;

public class ExProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("철수>>>");
		String chol = sc.next();
		System.out.println("영희>>>");
		String yeong = sc.next();
		
//		if(chol.equals ("바위"))
//			if(yeong.equals("가위"))
//				System.out.println("철수가 이김");
//			else if(yeong.equals("바위"))
//				System.out.println("비김");
//			else 
//				System.out.println("영희가 이김");
			
		
		
		
		
		
		if(chol.equals("바위")) 
			if(yeong.equals  ("가위")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "를 이겼어요~");
			else if(yeong.equals ("바위")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "를 비겼어요~");
		
			else 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "에게 졌어요..");
			
		
			
		
		else if(chol.equals ("가위")) 
			if(yeong.equals ("가위")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "와 비겼어요~");
			
			else if(yeong.equals ("보")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "를 이겼어요~");
			
			else 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "에게 졌어요..");
			
			
		
		else if(chol.equals ("보"))
			if(yeong.equals ("보")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "를 비겼어요~");
			else if(yeong.equals ("가")) 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "를 이겼어요~");
			
			else 
				System.out.println("철수가" + chol + "를 내서 영희의" + yeong + "에게 졌어요..");
			
		
		else 
			System.out.println("다시 입력해주세요");
		
//			
		
	}

}
