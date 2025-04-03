package com.wipro.programs;
import java.util.*;

public class WiproProgram { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        
        int totalSeconds = (hour * 3600) + (min * 60) + sec;
        
        System.out.println(totalSeconds);
        
        sc.close();
    }
}
