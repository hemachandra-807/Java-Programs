package Java_Programs;

public class DecimalToOctal {

	public static int deciamlToOctalNum(int decimal)
	{
		int octalNumber = 0,i=1;
		while(decimal>0)
		{
			octalNumber=octalNumber+decimal%8*i;
			decimal=decimal/8;
			i=i*10;
		}
		return octalNumber;
	}
	public static void main(String[] args) {
		int decimal=78;
		
		int octal=deciamlToOctalNum(decimal);
		System.out.println(octal);
	}
}
