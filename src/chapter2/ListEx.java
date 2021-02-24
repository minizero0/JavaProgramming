package chapter2;
import java.util.ArrayList;
import java.util.Random;	
public class ListEx {

	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(4);
		ArrayList<String> score = new ArrayList<>();
		score.add("조영민");
		score.add("박형준");
		score.add("정재빈");
		score.add("김승래");
		score.add("최호준");
		
		for(score)
			if(score.get(rand).equals("조영민"))
				System.out.println(score.get(rand)+ " 임포스터");
				else
					System.out.println(score.get(rand)+ " 선량한 시민");
				score.remove(rand);
				System.out.println(score);
		
		
	}

}
