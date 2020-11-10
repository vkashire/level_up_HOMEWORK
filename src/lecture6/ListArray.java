package lecture6;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {

    int[] array;
    public ListArray(int[] array) {
        this.array = array;
    }

    public void removeByValue(int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = 0;
                findAndDelete();
             }
        }

        System.out.println("новый массив после удаления по значению: " + Arrays.toString(array));
    }


   public void removeByIndex(int index){
        for(int i = 0; i < array.length; i++){
            if (i == index){
                array[i] = 0;
                findAndDelete();
            }
        }
        System.out.println("новый массив после удаления по индексу: " + Arrays.toString(array));
    }


   public void trim(int size){
       for(int i = size; i < array.length; i = size) {
               array[i] = 0;
               findAndDelete();
       }
       System.out.println("новый массив указанного размера: " + Arrays.toString(array));
   }


   private void findAndDelete(){
       for (int j = 0; j < array.length - 1; j++) {
           if (array[j] < array[j + 1]) {
               int x = array[j];
               array[j] = array[j + 1];
               array[j + 1] = x;
           }
        //System.out.println(Arrays.toString(array));
       }

       int[] newArray = new int[array.length - 1];
       for (int p = 0; p < array.length - 1; p++) {
           newArray[p] = array[p];
           //System.out.println(Arrays.toString(newArray));
       }
       array = newArray;
   }

}
