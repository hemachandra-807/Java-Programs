
public class LengthOfString_Without_Func {

	public static void main(String[] args) {
		String str = "hello";
		int i =0;
		try {
			for(;;i++) //find length using for loop
			{
				str.charAt(i);
			}
		} catch (Exception e) {

		}
		System.out.println(i);

//		int len = 0;
//		try {
//			while (true) {
//				str.charAt(len);
//				len++;
//			}
//		} catch (Exception e) {
//
//		}
//		System.out.println(len);
	}
}
