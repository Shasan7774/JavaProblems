package Assignments;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch4 {
    public static void main(String[] args) {
        /*4. Write a program that will find your key is found in the given array using binary search method
        numbers=[1,6,9,3,5,4,7]
        key=5
        */
        int numbers[] = new int[]{1,6,9,3,99,4,7,5};
        int key = 5;
        Arrays.sort(numbers);

        int index  = binarySearch(numbers, key);
        if(index != -1){
            System.out.println("key available at: "+index);
        }
        else {
            System.out.println("key unavailable: ");
        }

    }
}
