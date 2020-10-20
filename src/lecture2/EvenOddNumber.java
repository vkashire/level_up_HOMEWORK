package lecture2;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();

        int m = n % 2;
        if ( m == 0) {
            System.out.println("Число n является четным");
        } else {
            System.out.println("Число n является нечетным"); g
        }

    }
}
