package Java_Programs;

public class PermutationUsingRecursion {

    public static void Permutations(String input, String output) {
    	if(input.length()==0)
    	{
    		System.out.println(output);
    	}
    	for(int i=0;i<input.length();i++)
    	{
    		char c=input.charAt(i);
    		
    		String rem=input.substring(0, i)+input.substring(i+1);
    		Permutations(rem, output+c);
    	}
    }
     

    public static void main(String[] args) {
        String s = "abcd";
        Permutations(s,"");
    }
}
/*
outputs:
recur: normal:
abcd  abcd
abdc  abdc
acbd  acbd
acdb  acdb
adbc  adbc
adcb  adcb
bacd  bacd
badc  badc
bcad  bcad
bcda  bcda
bdac  bdac
bdca  bdca
cabd  cabd
cadb  cadb
cbad  cbad
cbda  cbda
cdab  cdab
cdba  cdba
dabc  dabc
dacb  dacb  
dbac  dbac
dbca  dbca
dcab  dcab
dcba  dcba
*/