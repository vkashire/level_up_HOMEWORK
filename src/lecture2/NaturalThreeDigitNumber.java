package lecture2;

import java.util.Arrays;

public class NaturalThreeDigitNumber {

    public static void main(String[] args){

        int x = (int) (100 + Math.random() * 900);
        System.out.println("рандомное число = " + x);

        int a = x / 100;
        int b =  ((x - a * 100) / 10);
        int c = x - a * 100 - b * 10;
        //System.out.println(a + ", " + b + ", " + c);

        // тут 2 решения нашлось
        // первое не особо изящное и с цифрами типа 818 будет 2 раза выводиться "самая большая цифра = 8":

        if((a > b && a > c) || (a > b && a == c) || (a > c && a == b)){
            System.out.println("по первому способу в числе " + x + " наибольшая цифра " + a);
        }

        if((b > a && b > c) || (b > a && b == c) || (b == a && b > c)){
            System.out.println("по первому способу в числе " + x + " наибольшая цифра " + b);
        }

        if((c > a && c > b) || (c > a && c == b) || (c == a && c > b)){
            System.out.println("по первому способу в числе " + x + " наибольшая цифра " + c);
        }

        //второе с массивом получше:
        int[] numbers = new int[]{a, b, c};
        Arrays.sort(numbers);
        System.out.println("по второму способу в числе " + x + " наибольшая цифра " + numbers[2]);

    }
}
