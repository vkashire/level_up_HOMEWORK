package lecture3;

public class Calculator {


        int x;
        int y;
        double a;
        double b;
        long c;
        long d;


    void amount (double a, double b){
        System.out.println("сумма равна двух введенных чисел равна " + (a + b));
    }
    void amount (long c, long d){
        System.out.println("сумма двух введенных чисел равна " + (c + d));
    }
    void amount (int x, int y){
        System.out.println("сумма двух введенных чисел равна " + (x + y));
    }



    void division (double a, double b) {
        System.out.println("частное двух введенных чисел равно " + a / b);
    }
    void division(long c, long d){
        System.out.println("частное двух введенных чисел равно " + c / d);
    }
    void division(int x, int y){
        System.out.println("частное двух введенных чисел равно " + x / y);
    }



    void difference (double a, double b) {
        System.out.println("разница двух введенных чисел равна " + (a - b) );
    }
    void difference (long c, long d) {
        System.out.println("разница двух введенных чисел равна " + (c - d) );
    }
    void difference (int x, int y) {
        System.out.println("разница двух введенных чисел равна " + (x - y) );
    }


    void multiplication (double a, double b) {
        System.out.println("произведение двух введенных чисел равно " + a * b);
    }
    void multiplication (long c, long d) {
        System.out.println("произведение двух введенных чисел равно " + c * d);
    }
    void multiplication (int x, int y) {
        System.out.println("произведение двух введенных чисел равно " + x * y);
    }
}





    //System.out.println("x = " + x + ", y = " + y);