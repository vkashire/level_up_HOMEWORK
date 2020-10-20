package lecture2;

import java.util.Arrays;

public class NonNegativeNumbers {

    public static void main(String[] args) {
        //create new array
        int[] sequence = new int[25];

        //fill the array with necessary values
        sequence[0] = 90;

        for(int i = 1; i < sequence.length; i++){
            sequence[i] = sequence[i-1] - 5;
        }

        //print positive numbers
        for(int i = 0; sequence[i] > 0; i++) {
            System.out.println(sequence[i]);
        }

    }
}
