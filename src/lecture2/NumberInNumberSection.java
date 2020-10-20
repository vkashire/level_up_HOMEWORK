package lecture2;

public class NumberInNumberSection {

    public static void main(String[] args){
        int x = (int)(5 + Math.random()*151);

        if(x > 25 && x < 100){
            System.out.println("число " + x + " содержится в интервале (25, 100)");
        } else {
            System.out.println("число " + x + " не содержится в интервале (25, 100)");
        }
    }
}
