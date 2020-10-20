package lecture2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Для вычисления !n введите значение натурального числа n: ");
        int n = sc.nextInt();
        int m = 1;

        if( n > 0 ) {
            for (int i = 1; i <= n; i++) {
                m = m * i;
            }
            System.out.println("n! = " + m);

        } else {
            System.out.println("Введенное число не является натуральным, факториал не будет вычислен.");
        }

    }

}

