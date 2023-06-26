package Assignments;

public class SwapWithTempVaraible1 {

    public static void main(String[] args) {
        //1. Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

    }

}
