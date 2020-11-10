package lecture5.task4;

public class MyClass  {
    public static void main(String[] args) {
        Object[] objectArray = new Object[]{4, "string"};
        //BaseFilter newBaseFilter = new BaseFilter();
          FilterService.filterArray(objectArray, new BaseFilter());
    }
}
