package Assignments;

import java.util.HashMap;

public class AmountBreakdown7 {
    /*7. Write a program that will breakdown the amount and count notes for any given amount.
    Here is the notes in the given array: notes=[1000,500,200,100,50,20,10,5,2,1]
    */
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 575;

        HashMap<Integer, Integer> noteCount = getNoteCount(notes, amount);

        System.out.println("Amount breakdown:");
        for (int note : noteCount.keySet()) {
            int count = noteCount.get(note);
            if (count > 0) {
                System.out.println(note + " " + count);
            }
        }
    }

    public static HashMap<Integer, Integer> getNoteCount(int[] notes, int amount) {
        HashMap<Integer, Integer> noteCount = new HashMap<>();

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                noteCount.put(note, count);
                amount %= note;
            } else {
                noteCount.put(note, 0);
            }
        }

        return noteCount;
    }

}
