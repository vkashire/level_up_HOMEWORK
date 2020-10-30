package lecture3;

public class CalculatorArrayTrigger {

    public static void main(String[] args) {

        Calculator rechner = new Calculator();

        rechner.amount(20, 4);
        rechner.difference(321321L, 2454L);
        rechner.multiplication(20.1,2);
        rechner.division(56,9);


        ArrayUtil numbers1 = new ArrayUtil();
        numbers1.min(new int[]{5, 48, 45, 5, 69, 32, 89});

        ArrayUtil numbers2 = new ArrayUtil();
        numbers2.max(new int[]{20, 45, 45, 5, 69, 01, 89});



    }

}
