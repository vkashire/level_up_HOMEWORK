package GothamBank;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class WorkWithAccount {



    public static void createAccount(String bankName,  String clientName,
                                     int accountNumber, String accountCurrency,
                                     Date date){
        BankAccount.accountAndClient.put(accountNumber, clientName);
        BankAccount.accountAndBank.put(accountNumber, bankName);
        BankAccount.accountAndCurrency.put(accountNumber, accountCurrency);
        BankAccount.accountAndMoney.put(accountNumber, 0);
        BankAccount.accountAndDateOpened.put(accountNumber, date);
        BankAccount.accountAndStatus.put(accountNumber, 0);

        System.out.println("Счет создан. Номер вашего нового счета: " + accountNumber + "\n"
                + "Дата открытия: " + date + "\n");
    }


    public static void getInformationAboutClient (String clientName)
    {
           for (int i = 0; i < WorkWithAccount.checkName(clientName).size(); i++) {

           Integer accountNumber = (Integer) WorkWithAccount.checkName(clientName).get(i);

           String name = clientName;
           String bank = BankAccount.accountAndBank.get(accountNumber);
           Integer accountMoney = BankAccount.accountAndMoney.get(accountNumber);
           String currency = BankAccount.accountAndCurrency.get(accountNumber);
           Date dateOpened = BankAccount.accountAndDateOpened.get(accountNumber);
           Date dateClosed = BankAccount.accountAndDateClosed.get(accountNumber);

           accountNumber.toString();
           accountMoney.toString();

           System.out.println("Информация о вашем счете:\n" +
                   "Банк " + bank + ", " +
                   "номер счета: " + accountNumber + ", " +
                   "открыт: " + dateOpened + ", " +
                   "баланс: " + accountMoney + " " + currency);

           if (BankAccount.accountAndStatus.get(accountNumber) == 1) {
               System.out.println("Счет был закрыт. Дата закрытия: " + dateClosed + " \n");
           }
       }
    }

    public static void changeBalance (Integer accountNumber, Integer money){
        if (BankAccount.accountAndStatus.get(accountNumber) == 0) {
            Integer accountMoney = BankAccount.accountAndMoney.get(accountNumber);
            Integer newAccountMoney = accountMoney + money;
            BankAccount.accountAndMoney.put(accountNumber, newAccountMoney);

            System.out.println("Баланс вашего счета равен " +
                    BankAccount.accountAndMoney.get(accountNumber) + " " +
                    BankAccount.accountAndCurrency.get(accountNumber) + " \n");
        } else {}
    }


    private static ArrayList checkName (String clientName){

        ArrayList<Integer> keysToFind = new ArrayList<>(BankAccount.accountAndClient.size());

           if(BankAccount.accountAndClient.containsValue(clientName)){

               Set<Integer> keys = BankAccount.accountAndClient.keySet();
               for(Integer key : keys){
                   String clientNameToFind = BankAccount.accountAndClient.get(key);
                   if(clientNameToFind.equals(clientName)){
                       keysToFind.add(key);
                   }
               }
           } else {
               System.out.println("На данное имя не зарегестрировано ни одного счета.");
           }
           return keysToFind;
   }

    public static void closeAccount (int accountNumber, Date date){
       if (BankAccount.accountAndStatus.get(accountNumber) == 0){
           BankAccount.accountAndStatus.put(accountNumber, 1);
           BankAccount.accountAndDateClosed.put(accountNumber, date);
           System.out.println("Счет с номером " + accountNumber + " закрыт.");
       } else {
           System.out.println("Указанный счет уже был закрыт ранее: " +
                   BankAccount.accountAndDateClosed.get(accountNumber));
       }
    }

}

