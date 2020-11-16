package lecture7;

import java.util.*;

public class MyCollections {

    public static void main(String[] args) {

        //задаем размер списочного массива
        int length = 15;

        //создаем коллекцию на основе списочного массива
        ArrayList<Integer> firstCollection = new ArrayList<>(length);

        //заполняем коллекцию рандомными значениями
        for (int i = 0; i < length; i++) {
            Random randomNumber = new Random();
            int x = (int) randomNumber.nextInt()/400000;
            firstCollection.add(x);
        }
        System.out.println(firstCollection);
//        for (int i = 0; i < length; i++) {
//            int x = (int) (Math.random() * 10);
//            firstCollection.add(x);
//        }


        //ищем минимум в коллекции через сортировку по возрастанию
        Collections.sort(firstCollection);
        int min = firstCollection.get(0);
        System.out.println("отсортироанная по возрастанию коллекция: " + firstCollection);
        System.out.println("минимальное значение в коллекции: " + min);


        //ищем максимум в коллекции через сортировку по убыванию
        Collections.reverse(firstCollection);
        int max = firstCollection.get(0);
        System.out.println("отсортироанная по убыванию коллекция: " + firstCollection);
        System.out.println("максимальное значение в коллекции: " + max);


        //создаем новую коллекцию на базе первой, копируя часть элементов
        ArrayList<Integer> secondCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            secondCollection.add(firstCollection.get(i));
        }
        System.out.println("урезанная до 10 элементов коллекция: " + secondCollection);


        //создаем новую коллекцию из отрицательных чисел
        ArrayList<Integer> negativeNumbers = new ArrayList<>(15);
        for (int j = 0; j < firstCollection.size(); j++) {
            if (firstCollection.get(j) < 0) {
                negativeNumbers.add(firstCollection.get(j));
            }
        }
        System.out.println("коллекция из отрицательных значений: " + negativeNumbers);


        //создаем новую коллекцию из положительных чисел
        ArrayList<Integer> positiveNumbers = new ArrayList<>(15);
        for (int j = 0; j < firstCollection.size(); j++) {
            if (firstCollection.get(j) > 0) {
                positiveNumbers.add(firstCollection.get(j));
            }
        }
        System.out.println("коллекция из положительных значений: " + positiveNumbers);


        //создаем коллекцию из уникальных значений предыдущей коллекции
        Set<Integer> uniqueCollection = new HashSet<>(secondCollection);
        System.out.println("коллекция из уникальных значений: " + uniqueCollection);


        //ищем сумму всех чисел коллекции
        int sum = 0;
        for(Integer element: uniqueCollection){
            sum += element;
        }
        System.out.println("сумма всех значений коллекции: " + sum);


        //удаляем из первой коллекции все нечетные числа
        for (int a = 0; a < firstCollection.size(); a++) {
            //почему некоторые нечетные числа все же остаются?
            if ( (firstCollection.get(a) % 2) != 0) {
                firstCollection.remove(a);
            }
        }
        System.out.println("оставшиеся четные числа коллекции: " + firstCollection);

        //найти индекс указанного числа в коллекции
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое число: ");
        int numberWithoutIndex = sc.nextInt();
        for (int i = 0; i < firstCollection.size(); i++){
            if (firstCollection.get(i).compareTo(numberWithoutIndex) == 0){
                System.out.println("index = " + i);
            }
        }



        }
    }


