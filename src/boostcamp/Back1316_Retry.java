package boostcamp;
import java.util.Scanner;

public class Back1316_Retry {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (check() == true)
				count++;
		}
		System.out.println(count);
	}
	public static boolean check() {
		boolean check[] =  new boolean[26];
		int perv = 0;
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			
			if (perv != now) { 
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					perv = now;
				}
				else
					return false;			
				}
			else
				continue;
		}
		return true;
	}

}
