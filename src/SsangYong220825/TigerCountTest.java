package SsangYong220825;

public class TigerCountTest {

	public static void main(String[] args) {
		String member[] = {"tiger", "kim", "     tiger", "TIGER", "     tIGEr ", "Lee"};
		int cnt = 0;
		for (String s : member) {
			if (s.trim().toLowerCase().equals("tiger"))
				cnt++;
		}
		System.out.println(cnt);
	}
	
}
