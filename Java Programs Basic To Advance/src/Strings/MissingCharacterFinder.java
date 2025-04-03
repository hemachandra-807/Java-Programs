package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MissingCharacterFinder {
    public static String findMissingCharacter(String string) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : string.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char missingChar = '\0';
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                missingChar = entry.getKey();
                break;
            }
        }

        StringBuilder reconstructed = new StringBuilder();
        boolean inserted = false;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            reconstructed.append(ch);
            if (ch == missingChar && !inserted) {
                reconstructed.append(ch);
                inserted = true;
            }
        }

        if (!inserted) {
            reconstructed.append(missingChar);
        }

        return reconstructed.toString();

    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String message = sc.next();
        System.out.println(findMissingCharacter(message));
    }
}

