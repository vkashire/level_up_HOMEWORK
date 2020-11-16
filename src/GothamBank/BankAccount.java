package GothamBank;


import java.util.*;

public class BankAccount {

    public String bank;
    public String name;
    public int accountNumber;

   public static HashMap <Integer, String> accountAndClient = new HashMap<Integer, String>();


    public static HashMap <Integer, String> accountAndBank = new HashMap<Integer, String>();

    public static HashMap<Integer, Integer> accountAndMoney = new HashMap<Integer, Integer>();

    public static HashMap<Integer, String> accountAndCurrency = new HashMap<Integer, String>();

    public static HashMap<Integer, Date> accountAndDateOpened = new HashMap<Integer, Date>();

    public static HashMap<Integer, Date> accountAndDateClosed = new HashMap<Integer, Date>();

    public static HashMap<Integer, Integer> accountAndStatus = new HashMap<Integer, Integer>();

    public static int createNewAccount(){
            Random randomNumber = new Random();
            int x = (int) randomNumber.nextInt();
         if ( x < 0){
              x = x * (-1);
         }
        return x;
    };

}
