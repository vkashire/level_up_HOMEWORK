package lecture3;

import java.util.Arrays;

public class ArraySorting {

    public void bubbleSort(int[] array) {
        int[] massiv = new int[array.length + 1];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
            }
        System.out.println("новый массив: " + Arrays.toString(array));
        }

    }


