package Java_Programs;

import java.util.Scanner;

public class FactorialNumHighest {

    
    public static int isFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();  

        int highest = -1;          
        int highestfact = -1;      

        for (int i = 1; ; i++) {
            int fact = isFact(i);  

            if (fact > range) {    
                break;
            }

            highestfact = fact;
            highest = i;
        }

        if (highest != -1) {
            System.out.println("The number with the highest factorial within the range is: " + highest);
            System.out.println("Its factorial is: " + highestfact);
        } else {
            System.out.println("No factorial number found within the range.");
        }

        sc.close();
    }
}
