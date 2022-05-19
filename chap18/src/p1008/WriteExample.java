package p1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/Temp/test.txt");
		char data [] = "조바이든".toCharArray();
		for(int i = 0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
