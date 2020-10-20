package lecture2;

import java.util.Arrays;

public class IncreasingSequenseSorting {
    public static void main(String[] args){

     //write values foe a,b,c
     int a = -2;
     int b = 3;
     int c = -5;

     //convert a,b,c values into array
     int[] list = new int[]{a,b,c};

     //sort arrays elements
     Arrays.sort(list);

     //print array
     System.out.println(Arrays.toString(list));

    }
}
