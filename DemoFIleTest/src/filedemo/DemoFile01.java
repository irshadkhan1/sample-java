package filedemo;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFile01 {
	public static void main(String[] args)throws IOException {
		//File f = new File ();
		FileWriter fw = new FileWriter("C:\\NewFolder\\NewIO2.txt",true);
		fw.write(97);
		fw.write("\n");
		fw.write("durga\nsoftware");
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		}
}
