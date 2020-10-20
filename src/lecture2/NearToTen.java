package lecture2;

import java.util.Scanner;

public class NearToTen {
    public static void main(String[] args) {

        //write m and n values
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число m:");
        double m = sc.nextDouble();

        System.out.println("Введите число n:");
        double n = sc.nextDouble();

        //check that m and n are positive
        if (m > 0 && n > 0) {

            //compare m with 10 and find difference
            double dif1;
            if (m > 10) {
                dif1 = m - 10;
            } else {
                dif1 = 10 - m;
            }

            //compare n with 10 and find difference
            double dif2;
            if (m > 10) {
                dif2 = n - 10;
            } else {
                dif2 = 10 - n;
            }

            //compare results of previous two steps
            if (dif1 > dif2) {
                System.out.println("число " + n + " " + "ближе к 10, чем число " + m);
            } else {
                System.out.println("число " + m + " " + "ближе к 10, чем число " + n);
            }

        } else {
            System.out.println("числа m и n должны быть положительными.");
        }
    }
}
