package GothamBank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import static GothamBank.WorkWithConsoleActions.menuText;


public class BankConsole {

    public static void main(String[] args) throws IOException {


        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                "Здравствуйте, уважаемый клиент.\n" +
                 "Выберете номер действия, которое вы хотите совершить:\n" +
                        menuText);

        while (true) {

            String line = consoleReader.readLine();
            int actionNumber = Integer.parseInt(line);

            WorkWithConsoleActions.checkActionNumber(actionNumber);

            WorkWithConsoleActions.legalActionNumber(actionNumber);
        }
    }
}
