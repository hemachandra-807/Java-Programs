package String_Programs;

public class StringReplaceMethod {

	public static void main(String[] args) {
		String s1="developer";
		String s2=s1.replace('e', '@');
		System.out.println(s2);
		
		String s3=s1.replace("velo", "VELO");
		System.out.println(s3);
		
		String s4=s1.replace('e', ' ');
		System.out.println(s4);
		
		String s5=s1.replace('e', '3');
		System.out.println(s5);
	}
}
