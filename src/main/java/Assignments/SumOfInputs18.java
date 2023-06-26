package Assignments;

import java.util.Scanner;
/*18. Write a program that will take integer numbers as user input continuously
  and print the sum of numbers until user input q from the keyboard.
  When user input q, program will be quit. If user inputs another character,
  then the program will ask to input the number again.
*/
public class SumOfInputs18 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Input a number");
        Scanner scr = new Scanner(System.in);
        while (true) {
            int num = scr.nextInt();
            sum += num;
            System.out.println(sum);
            //char ch = (char) num;
            if (num == -1) {
                break;
            } else {
                System.out.println("If you want to continue enter another number");
            }
        }
    }

}
