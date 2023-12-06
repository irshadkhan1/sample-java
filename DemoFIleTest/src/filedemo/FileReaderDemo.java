package filedemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			
		FileReader fr = new FileReader("D:\\New folder\\New.txt");
		
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
		catch(IOException e) {
		System.out.println("Exception handled");
		
	}}}
	
		

