package SsangYong220811;
import java.util.Scanner;

public class KooCode {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String name;
		String star;
		int month, day;
		star = "물병자리"
		System.out.println("이름을 입력해 주세요");
		name = sc.next();
		System.out.println("월을 입력해 주세요");
		month = sc.nextInt();
		System.out.println("일을 입력해 주세요");
		day = sc.nextInt();
		if( month < 1 || month > 12)
		{
			System.out.println("입력오류");
			return;
		}

		switch(month){
			case 1:
				if(day>=20 && day<=31 )
			{
				System.out.println(name+"님의 별자리는" +물병자리+" 입니다..");		
			}
				break;

}
