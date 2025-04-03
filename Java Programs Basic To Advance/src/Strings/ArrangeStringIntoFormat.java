package Strings;

public class ArrangeStringIntoFormat {

	/*
	 * input: "20010110807415170112458074"
	 * 
	 * output: 
	 * Date: 10-01-2001
	 * Mobile: 8074151701
	 * Time:12:45
	 * Port: 8074
	 */
	public static void main(String[] args) {
	
		String s = "20010110807415170112458074";
		
		String Date = s.substring(0,8);
		Date = Date.substring(6,8)+"-"+Date.substring(4,6)+"-"+Date.substring(0,4);
		String Mobile = s.substring(8,18);
		String Time = s.substring(18,22);
		Time = Time.substring(0,2)+":"+Time.substring(2);
		String Port = s.substring(22,26);
		
		System.out.println("Date: "+Date+" "+"\nMobile: "+Mobile+" "+"\nTime: "+Time+" "+"\nPort: "+Port);
	}
}
