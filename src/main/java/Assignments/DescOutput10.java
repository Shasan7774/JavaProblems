package Assignments;

public class DescOutput10 {
    public static void main(String[] args) {
        /*
        10. Write a program that will give following output:
        12345
        2345
        345
        45
        5
        */
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
