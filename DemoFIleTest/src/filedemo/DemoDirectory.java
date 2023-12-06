package filedemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoDirectory {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\LENOVO\\Desktop\\Irshad_dir");
            f.mkdir();
            File f1 = new File(f,"demo.txt");
            f1.createNewFile();
            System.out.println("success");
            FileWriter fw = new FileWriter(f1);
            fw.write("this is irshad khan file ");
         
         fw.close();   
	}

}
