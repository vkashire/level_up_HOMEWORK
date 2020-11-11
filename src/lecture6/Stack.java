package lecture6;

import java.util.Arrays;

public class Stack {
    private int[] stack;

    public Stack(int[] stack) {
        this.stack = stack;
    }

    public void push(int x){
        for (int i = 0; i < stack.length; i++){
           if(stack[i] == 0){
               stack[i] = x;
               //System.out.println(Arrays.toString(stack));
               break;
           }
        }
        System.out.println(Arrays.toString(stack));
    }

    public int pop(){
        for(int i = 1; i < stack.length; i++){
            if(stack[ i ] == 0){
                stack[i - 1] = 0;
            }
            else {
                stack[stack.length - 1] = 0;
            }
            //тут косяк, если весь массив заполнен, то обнуляются 2 последних элемента

        }
        System.out.println(Arrays.toString(stack));
        return 0;
        //этот return явно не тут подразумевался, но не знаю куда еще его впихнуть
    }

}
