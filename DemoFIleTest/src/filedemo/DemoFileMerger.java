package filedemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoFileMerger {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("D:\\New folder\\file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\New folder\\file1.txt"));
		String line = br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
			
			}
	br= new BufferedReader(new FileReader("D:\\\\New folder\\\\file2.txt"));
		line =br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		
	}

}
