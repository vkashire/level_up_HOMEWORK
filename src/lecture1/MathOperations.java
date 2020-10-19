package lecture1;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = sc.nextDouble();

        System.out.println("Введите число b: ");
        double b = sc.nextDouble();

        System.out.println("a + b = " + (double) ( a + b) );
        System.out.println("a - b = " + (double) (a - b) );
        System.out.println("a * b = " +  (double) a * b );
        System.out.println("a / b = " +  (double) a / b );

    }
}
