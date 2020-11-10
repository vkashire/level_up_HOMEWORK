package lecture6;

import java.util.ArrayList;

public class TriggerClass {
    public static void main(String[] args) {
        ListArray myLIST = new ListArray(new int[]{1,3,8,0,4,8});
        myLIST.removeByValue(3);
        myLIST.removeByIndex(2);
        myLIST.trim(2);

    }
}

