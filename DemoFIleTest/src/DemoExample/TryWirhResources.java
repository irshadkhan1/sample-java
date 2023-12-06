package DemoExample;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWirhResources
{    
public static void main(String args[]){      
       // Using try-with-resources  
try(FileOutputStream fos =new FileOutputStream("D:\\New folder\\New.txt"))
{      
String msg = "Welcome to javaTpoint! hello this is writen by me"; 
//converting string into byte array 
byte byteArray[] = msg.getBytes();      
fos.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}catch(Exception exception){  
      System.out.println(exception);  
}      
}      }
