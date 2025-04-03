package EasyWayToDoPatterns;

public class PrimeCountPattern {

    public static void main(String[] args) {
        int num = 5; 
        int currentNumber = 2; 

        for (int i = 1; i < num; i++) { 
            for (int j = 1; j <= i; j++) {

            	while (!isPrime(currentNumber)) {
                    currentNumber++;
                }
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
    	boolean flag = true;
    	if(num<=1)
		{
    		return false;
		}else
		{
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag=false;
					break;
				}
			}
		}
        return flag;
    }
}
