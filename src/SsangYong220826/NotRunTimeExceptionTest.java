package SsangYong220826;

import java.io.FileWriter;
import java.io.IOException;

//IOException은 RuntimeException의 후손이 아니기 때문에 예외처리를 직접 해줘야한다.
public class NotRunTimeExceptionTest {

	public static void main(String[] args) {
		FileWriter fw = new FileWriter("hello.txt");
		fw.write("hello java");
		fw.close();
		
	}

}
