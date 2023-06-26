package Assignments;

public class SwapWithoutTempVariable2 {
    public static void main(String[] args) {
        //2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b; //20
        a = a - b; //10
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
