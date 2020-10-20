package lecture2;

import java.util.Arrays;

public class OddSequenseElements {

    public static void main(String[] args){

        //create an array
        int[] list = new int[60];

        //fill the array
        list[0] = 1;
        for(int i = 1; i < list.length; i++ ){
            list[i] = list[i - 1] + 2;
            //System.out.println(list[i]);
        }

        //print first 55 elements
        for(int i = 0; i < 55; i++){
            System.out.println(list[i]);
        }

    }
}
