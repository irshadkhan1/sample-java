package DemoExample;

public class TestException {

	public static void main(String[] args) {
	int x = 10, y=0;
	
		
		try {
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}}}
