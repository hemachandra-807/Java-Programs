package com.cognizant.programs;
import java.util.*;

public class UniqueAirportCodes {
    public static int countUniqueCodes(int N, String S) {
        Set<String> uniqueCodes = new HashSet<>();
        
        for (int i = 0; i < N; i += 3) {
            String code = S.substring(i, i + 3);
            
            char[] chars = code.toCharArray();
            Arrays.sort(chars);
            
            String normalizedCode = new String(chars);
            
            uniqueCodes.add(normalizedCode);
        }
        
        return uniqueCodes.size();
    }

    public static void main(String[] args) {
        int N = 6;
        String S = "DELLED";
        
        int result = countUniqueCodes(N, S);
        System.out.println(result); 
    }
}
