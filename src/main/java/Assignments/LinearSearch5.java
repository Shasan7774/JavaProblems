package Assignments;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class LinearSearch5 {
    public static void main(String[] args) {
        /*5. Write a program that will find your key is found in the given array using linear search method
        numbers=[1,6,9,3,5,4,7]
        key=5
        */
        int numbers[] = new int[]{1,6,9,3,99,4,7,5};
        int key = 5;
        Arrays.sort(numbers);

        int index  = linearSearch(numbers, key);
        if(index != -1){
            System.out.println("key available at: "+index);
        }
        else {
            System.out.println("key unavailable: ");
        }
    }
    public static int linearSearch(int[]number, int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

}
