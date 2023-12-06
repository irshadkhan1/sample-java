package filedemo;

import java.io.File;
//wap to fetch and count file or directory from dir path
public class CountFileAndDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		File f = new File("D:\\New folder");
		String[] s= f.list();
		for(String s1:s) {
			File f1= new File(f,s1);
		//	if(f1.isDirectory())
			if(f1.isFile()) {
			count++;
			System.out.println(s1);
			}
		}
		System.out.println("total file :" +count);
	}

}
