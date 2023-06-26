package Assignments;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumbers8 {
    public static void main(String[] args) {
        //8. Print the prime numbers of 2 to 100
        int a = 100;
        for(int i=2; i<=100; i++){
            if(primeNumber(i)){
                System.out.print(i+",");
            }
        }

    }
    public static boolean primeNumber(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
    return true;
    }
}