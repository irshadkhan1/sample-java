package filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("D:\\New folder\\NewIO2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("durga");
		bw.flush();
		bw.close();

	}

}
