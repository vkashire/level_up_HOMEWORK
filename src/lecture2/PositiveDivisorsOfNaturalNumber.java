package lecture2;

import java.util.Scanner;

public class PositiveDivisorsOfNaturalNumber {

    public static void main(String[] args) {

        //enter value for q
        Scanner sc = new Scanner(System.in);
        System.out.println("введите натуральное число: ");
        int q = sc.nextInt();

        //check that q is a natural number
        if (q < 0) {
            System.out.println("введенное число не является натуральным");
        }

        //check positive divisors, print values

        System.out.println("положительные делители введенного числа: ");
        for (int g = 1; g <= q; g++) {
            if (q % g == 0) {
                System.out.println(g);
            }

        }
    }
}