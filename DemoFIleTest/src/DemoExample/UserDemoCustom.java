package DemoExample;

class UserCustomException extends Exception 
{
	
	//private static final long serialVersionUID = -6530295601007184133L;

	public UserCustomException(String str) {
		super(str);
	}
}

public class UserDemoCustom {

	public static void main(String[] args) {

        try  
        {  
            throw new UserCustomException("This is user-defined exception");  
        }  
        catch (UserCustomException e)  
        {  
            System.out.println("Caught Exception");  
        
            System.out.println(e.getMessage());  
        }  
	}

}
