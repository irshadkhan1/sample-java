package filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\New folder\\New.txt");
		char[] ch =new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		//int i= fr.read();
		/*while(i!=-1) {
			System.out.println((char)i);
			i= fr.read();
		}*/
		fr.read(ch);
		for(char ch1:ch) {
			System.out.println(ch1);
		}
		fr.close();
		}

}
