package Recursion_Problems;

import java.util.Scanner;

public class PrimeNum {

    public static boolean isPrime(int num, int i) {
        if (num <= 1) {
            return false; 
        }
        if (i == 1) {
            return true; 
        }
        if (num % i == 0) {
            return false; 
        }
        return isPrime(num, i - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num, num / 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}
