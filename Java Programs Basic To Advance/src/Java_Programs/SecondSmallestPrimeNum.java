package Java_Programs;

import java.util.Scanner;

public class SecondSmallestPrimeNum {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int smallestPrime = -1;
        int secondSmallestPrime = -1;

        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                if (smallestPrime == -1) {
                    smallestPrime = i;
                } else {
                    secondSmallestPrime = i;
                    break;
                }
            }
        }

        if (secondSmallestPrime != -1) {
            System.out.println("Second smallest prime number: " + secondSmallestPrime);
        } else {
            System.out.println("No second smallest prime number found.");
        }

        sc.close();
    }
}
