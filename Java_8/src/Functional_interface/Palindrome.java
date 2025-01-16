package Functional_interface;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw?"; // Example input
       
        boolean isPalindrome = isPalindrome(input);
        
        System.out.println("Is the string a palindrome? " + isPalindrome); // Output: true
    }
  
    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
      String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is equal to its reverse using streams
        String reversed = cleanedInput.chars() // Stream of characters
                                     .mapToObj(c -> (char) c) // Convert int to Character
                                      .map(String::valueOf) // Convert each Character to String
                                      .collect(Collectors.joining()); // Join into a single string

        // Compare cleaned input with reversed string
        return cleanedInput.equals(reversed);
      
      
        
      
        
    }
}
