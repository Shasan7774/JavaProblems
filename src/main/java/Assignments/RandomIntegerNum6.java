package Assignments;

import java.util.Arrays;

public class RandomIntegerNum6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 78, 85, 6, 7, 67, 8, 9, 12, 11,200, 515};

        //Arrays.sort(numbers);
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);

            if (numbers[i] > max) {
                max = numbers[i];
            }else if ((numbers[i] < max)) {
                if (numbers[i] < min) {
                    max = numbers[i];
                }
            }
        }
        System.out.println("max value in the array: " + max);
        System.out.println("min number in the array: " + min);
/*
        int max = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max value in the array: "+max);

        int min = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if(numbers[i] < min){
                max = numbers[i];
            }
        }
        System.out.println("min number in the array: " +min);

*/
    }
}
