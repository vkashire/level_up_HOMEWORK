package lecture3;

import java.util.Arrays;

public class ArrayUtil {

      public int min(int[] array) {
       Arrays.sort(array);
       System.out.println("наименьшее число в массиве " + array[0]);
       return array[0];
    }

    public int max(int[] array) {
        Arrays.sort(array);
        int x = array.length - 1;
        System.out.println("наибольшее число в массиве " + array[x]);
        return array[x];
    }

}
