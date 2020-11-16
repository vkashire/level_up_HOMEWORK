package GothamBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class WorkWithConsoleActions {

   private static String menuText =
            ("1. Добавить счет\n" +
                    "2. Изменить баланс счета\n" +
                    "3. Закрыть счет\n" +
                    "4. Информация о всех счетах\n" +
                    "5. Выход из меню\n");


    public static boolean checkActionNumber(int actionNumber){
        if (actionNumber > 5 || actionNumber <= 0) {
            System.out.println("К сожалению введенный вами номер действия не доступен, " +
                    "выберете действие из списка:\n" + menuText);
            return false;
        }
        return true;
    }


    public static void legalActionNumber (int actionNumber) throws IOException {

        if (actionNumber == 1) { WorkWithConsoleActions.addNewAccount(); }
        if (actionNumber == 2) { WorkWithConsoleActions.changeAccountBalance(); }
        if (actionNumber == 3) { WorkWithConsoleActions.closeAccount(); }
        if (actionNumber == 4) { WorkWithConsoleActions.showAllAccountsInfo(); }
        if (actionNumber == 5) { System.exit(0); }

    }

    private static void addNewAccount() throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы выбрали добавить счет. \n");

        System.out.println("Введите название банка: ");
        String bankName1 = consoleReader.readLine();

        System.out.println("Введите ваше имя: ");
        String clientName1 = consoleReader.readLine();

        System.out.println("Введите международное название валюты нового счета: ");
        String accountCurrency1 = consoleReader.readLine();

        int accountNumber1 = BankAccount.createNewAccount();
        Date date1 = new Date();

        WorkWithAccount.createAccount(bankName1, clientName1,
                accountNumber1, accountCurrency1, date1);

        System.out.println("Выберете номер действия, которое вы хотите совершить:\n" + menuText);
    }


    private static void changeAccountBalance() throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы выбрали изменение баланса счета. \n");

        System.out.println("Введите ваше имя: ");
        String clientName2 = consoleReader.readLine();

        WorkWithAccount.getInformationAboutClient(clientName2);

        if (BankAccount.accountAndClient.containsValue(clientName2)) {
            System.out.println("Введите номер счета, баланс которого хотите изменить: ");
            String accountNumber2Line = consoleReader.readLine();
            int accountNumber2 = Integer.parseInt(accountNumber2Line);

            if (BankAccount.accountAndStatus.get(accountNumber2) == 1) {

                System.out.println("Данный счет невозможно пополнить, так как он был закрыт. \n");

            } else {

                System.out.println("Введите сумму пополнения. Если вы желаете снять деньги, то ввидите желаемую сумму со знаком минус: ");
                String accountMoney2Line = consoleReader.readLine();
                int accountMoney2 = Integer.parseInt(accountMoney2Line);

                WorkWithAccount.changeBalance(accountNumber2, accountMoney2);
            }

            System.out.println("\nВведите номер следующего действия:\n" + menuText);

        }
    }


    private static void closeAccount () throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы выбрали закрытие счета. \n");

        System.out.println("Введите ваше имя: ");
        String clientName3 = consoleReader.readLine();

        WorkWithAccount.getInformationAboutClient(clientName3);

        System.out.println("Введите номер счета, оторый хотите закрыть: ");

        String accountNumber3Line = consoleReader.readLine();
        int accountNumber3 = Integer.parseInt(accountNumber3Line);
        Date date3 = new Date();

        WorkWithAccount.closeAccount(accountNumber3, date3);

        System.out.println("Введите номер следующего действия:\n" + menuText);
    }


    private static void showAllAccountsInfo () throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы выбрали отображение информации о всех счетах. \n");

        System.out.println("Введите ваше имя: ");
        String clientName4 = consoleReader.readLine();

        WorkWithAccount.getInformationAboutClient(clientName4);

        System.out.println("Введите номер следующего действия:\n" + menuText);
    }

}
