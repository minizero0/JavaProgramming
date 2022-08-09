package boostcamp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back11720_Buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for (byte value : br.readLine().getBytes())
			sum += value - '0';
		System.out.println(sum);
	}
	
}
