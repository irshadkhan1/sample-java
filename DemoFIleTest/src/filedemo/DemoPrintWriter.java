package filedemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter("D:\\New folder\\New.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println("durga");
		pw.flush();
		pw.close();

	}

}
