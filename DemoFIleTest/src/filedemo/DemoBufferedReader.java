package filedemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\New folder\\New.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
