package p1008;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/Temp/test.txt");
		char data [] = "무궁화 꽃이 피었습니다.".toCharArray();
		writer.write(data,3,2);
		writer.flush();
		writer.close();
	}

}
