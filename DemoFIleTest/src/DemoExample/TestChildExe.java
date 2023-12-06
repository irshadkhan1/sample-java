package DemoExample;


 class Parent{    
	  void msg() throws RuntimeException {  
	    System.out.println("parent method");  
	  }    
}

public class TestChildExe extends Parent {

	  void msg() throws ArithmeticException  {    
	    System.out.println("child method");    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   Parent p = new TestChildExe();    
		   p.msg();    
		  }    

	}


