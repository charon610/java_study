package p1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/Temp/test.txt");
		char data [] = "조바이든".toCharArray();
		writer.write(data,1,2);
		writer.flush();
		writer.close();
	}

}
