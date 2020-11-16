package lecture7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WorkWithString {

    public static void main(String[] args) {

        //вводим текст с консоли
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();

        //удаляем спец символы
//        text.replace("!", "");
//        System.out.println(text);

        //разбиваем текст на слова

        String[] separateWords = text.split(" ");
        //System.out.println(Arrays.toString(separateWords));

        ArrayList<String> words = new ArrayList<>(Arrays.asList(separateWords));
        System.out.println(words);


    }
}
