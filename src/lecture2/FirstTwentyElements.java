package lecture2;

import java.util.Arrays;

public class FirstTwentyElements {

    //нужно использовать ArrayList
    public static void main(String[] args){

        // Create an array
        int[] list = new int[50];
        list[0] = 2;

        // Fill it with numbers, use a for-loop
        for(int i = 1; i < list.length; i++){
            list[i] = list[i-1] * 2;
         }
        System.out.println(Arrays.toString(list));

        // Print the first 20 results
        for(int i = 0; i < 20; i++){
            System.out.println("элемент массива " + i + ": " + list[i]);
         }

    }
}
