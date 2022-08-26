package SsangYong220826;

import java.io.FileWriter;
import java.io.IOException;

public class NotRunTimeExceptionTest02 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.txt");
			fw.write("hello java");
			fw.close();
			System.out.println("maked file");
		}catch(IOException e) {
			System.out.println("Exception warning");
		}
	}
}
