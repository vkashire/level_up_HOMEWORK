package lecture6;

import java.util.ArrayList;

public class TriggerClass {
    public static void main(String[] args) {
//        ListArray myLIST = new ListArray(new int[]{1,3,8,0,4,8});
//        myLIST.removeByValue(3);
//        myLIST.removeByIndex(2);
//        myLIST.trim(2);

        Stack myStack = new Stack(new int[5]);
        myStack.push(1);
        myStack.push(5);
        myStack.push(1);
        myStack.push(3);
        myStack.push(9);
        myStack.push(7);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }

}

