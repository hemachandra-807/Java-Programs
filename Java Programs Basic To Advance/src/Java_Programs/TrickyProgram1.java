package Java_Programs;

import java.util.*;
public class TrickyProgram1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b,c;
		a=b=c=new Scanner(System.in).nextInt();
		String good="You are good...";
		String bad="You are bad...";
		System.out.println(a==b&&b==c?bad:good);
	}
}
