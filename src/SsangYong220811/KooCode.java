package SsangYong220811;

import java.util.Scanner;
class	Star  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		String star;
		int month, day;
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
				star = "물병자리";		
			}
				break;
			case 2:
					if(day>=1 && day<=18 )
					{
						star = "물병자리";		
					}
					else(day>=19 && day<=28)
					{
						star = "물고기자리";
					}
				break;
			case 3:
					if(day>=1 && day<=20 )
					{
						star = "물고기자리";		
					}
					else(day>=21 && day<=31)
					{
						star = "양자리";
					}
				break;
			default:return;
		}
		System.out.println(name+"님의 별자리는"+star+"입니다..");
	}
}