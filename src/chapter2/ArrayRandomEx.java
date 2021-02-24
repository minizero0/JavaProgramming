package chapter2;
import java.util.Random;


public class ArrayRandomEx {

	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(5);
		String[] name = {"조영민", "정재빈", "김승래", "박형준", "최호준", "김태현"};
		
		if(name[rand].equals("조영민"))
			System.out.println(name[rand]+" 당첨!");
		else
			System.out.println(name[rand]+ " 미당첨!");
	}

}
