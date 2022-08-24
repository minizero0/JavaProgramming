package SsangYong220824;

import java.util.TreeSet;
import java.util.Random;

//Set을 이용해 Lotto 생성기 만들기 

public class SetLottoTest {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Random r = new Random();
		
		for (int i = 0; i < 6; i++) {
			boolean n = set.add(r.nextInt(45)+1);
			if (!n)
				i--;
		}
		System.out.print(set + " ");
	}
}
