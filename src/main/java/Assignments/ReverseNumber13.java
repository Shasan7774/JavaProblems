package Assignments;

import java.util.Scanner;

public class ReverseNumber13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int reverse = 0;

        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println("After Reversing: " + reverse);
    }
}
