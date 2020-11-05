package lecture3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySorting {

public int[] bubbleSort(int[] array){
int [] massiv = new int[]{array.length};
    for(int i = 1; i < array.length; i++){
        if (array[i] > array[ i - 1 ]){
            int x = array[ i ];
            int y = array[ i - 1 ];
            massiv[i] = y;
            massiv[ i - 1 ] = x;
            break;
        }
    }

System.out.println("новый массив: " + Arrays.toString(massiv));
return massiv;
}

//private void toSwap(int firstNumber, int secondNumber){
//    int temp = firstNumber;
//    firstNumber = secondNumber;
//    secondNumber = temp;
//}

}


//for (int j = i + 1; j < glassesOfWine.length; j++, i++){
//        glassesOfWine[i] = glassesOfWine[j];
//        }