package lecture1;

import java.util.Scanner;

public class LinearEquation {

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        float a = sc.nextFloat();

        System.out.println("Введите число b: ");
        float b = sc.nextFloat();


       // float a = 2;
        //float b = 5;

        float x;
        //a * x + b = 0;
        System.out.println("a * x + b = 0 ");
        System.out.println("x = " + (-b/a));

    }
}

