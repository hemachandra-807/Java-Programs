
public class Ip_Address_Validation {

	static boolean validation(String s) {
		String[] arr = s.split("[.]");
		if (arr.length > 4 || arr.length < 4) {
			return false;
		}
		for (String ele : arr) {
			int n = Integer.parseInt(ele);
			if (n < 0 || n > 255) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123.253.144.078";

		if(validation(str))
		{
			System.out.println("Valid Ip");
		}
		else
		{
			System.out.println("Invalid Ip");
		}
	}
}
