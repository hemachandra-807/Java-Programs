package Java_Programs;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to convert decimal to binary: ");
		int num = sc.nextInt();
		int binary = 0,i=1;
		while (num > 0) {
			int bit = num % 2;
			binary = bit * i + binary;
			i=i*10;
			num = num / 2;
		}
		System.out.println(binary);
		
		//if required to do it in string
		/*String str="";
		while(num>0)
		{
			int bit=num%2;
			str=bit+str;
			num=num/2;
		}
		System.out.println(str);*/
		sc.close();
	}
}
