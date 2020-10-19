package lecture2;

import java.util.Arrays;

public class FourDigitNumberInSequense {

    public static void main(String[] args){

        //create an array
        int[] list = new int[5000];
        list[0] = 1000;

        //fill the array, use for loop
        for(int i = 1; i < list.length; i++){
            list[i] = list[i-1] + 3;
        }
        System.out.println(Arrays.toString(list));

         //show all four-digit numbers
        for (int i = 0; list[i] >= 1000 && list[i] <= 9999; i++) {
            System.out.println(list[i]);
        }

    }
}
