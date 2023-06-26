package Assignments;

public class SecondLargetNumberArray11 {
    public static void main(String[] args) {
        /*Find out the second largest element of the given array
        numbers=[5,3,9,7,4,1,8]
        */
        int[] numbers = new int[]{5, 3, 9, 7, 4, 1, 8};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
