package boostcamp;
import java.util.Scanner;

public class Back2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'c' && i < s.length()-1) {
				if (s.charAt(i + 1) == '-' || s.charAt(i + 1) == '=') {
					i++;
					
				}
			}
//			else if(s.charAt(i) == 'd' && i < s.length()-2) {
//				if ( s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
//					i += 2;
//					
//				}
//			}
//			else if(s.charAt(i) == 'd' && i < s.length()-1) {
//				if (s.charAt(i + 1) == '-') {
//					i++;
//					
//				}
//			}
			else if(s.charAt(i) == 'd' && i < s.length()- 1) {
				if(s.charAt(i + 1) == '-') {	// d- 일 경우
						i++;
					}
				else if(s.charAt(i + 1) == 'z' && i < s.length() - 2) {
					
					if(s.charAt(i + 2) == '=') {	// dz= 일 경우
						i += 2;
					}
				}
			}
			else if((s.charAt(i) == 'l' || s.charAt(i) == 'n') && i < s.length()-1) {
				if (s.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if((s.charAt(i) == 's' || s.charAt(i) == 'z') && i < s.length()-1) {
				if (s.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);

	}

}
