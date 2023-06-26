package Assignments;

import java.util.Scanner;

public class PalindromeString17 {
    //17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
    //Input: Civic
    //Output: true
    //Input: One
    //Output: false
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the text1: ");
        String text = scr.nextLine();


        boolean isPalindrome = palindromeTest(text);

        if(isPalindrome){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean palindromeTest(String text){
        String reverse = new StringBuilder(text).reverse().toString();

        return text.equals(reverse);
    }
}
