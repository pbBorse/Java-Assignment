package Assing;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    public static boolean isPangram(String input) {
        
        boolean[] alphabetPresent = new boolean[26];
        
        input = input.toUpperCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                alphabetPresent[c - 'A'] = true;
            }
        }
        
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false; 
            }
        }
        
        return true;
    }
}

