package filedemo;

import java.io.File;

public class DemoFileCount {

	public static void main(String[] args) {
		
		int count=0;
		File f = new File("D:\\New folder");
		String[] s= f.list();
		for(String s1:s) {
			count++;
			System.out.println(s1);
			
		}
		System.out.println("total file :" +count);
	}

}
