package Strings;

public class EmailValidationWithoutAnyInbuiltMethods {

	public static int isLen(String s)
	{
		int len = 0;
		 while (true) {
	            try {
	                byte c = s.getBytes()[len];
	                len++; 
	            } catch (Exception e) {
	            	return len;
	            }
	        }
	}
//	public static boolean emailValidation(String s)
//	{
//		if()
//	}
	public static void main(String[] args) {
		 String email = "Hemachandra726@gmail.com";
		 
		 
	}
}
