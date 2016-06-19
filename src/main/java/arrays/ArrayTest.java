package arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] integerArray = new int[-10];
        integerArray[0] = 1;
        integerArray[-1] = 2;
        integerArray[-2] = 3;
        integerArray[-3] = 4;
        integerArray[-4] = 5;
        
        for(int item:integerArray){
            System.out.print(item+",");
        }
        
        /*
         * will it's make runtime exception
         * Exception in thread "main" java.lang.NegativeArraySizeException
         * at arrays.ArrayTest.main(ArrayTest.java:6)
         */
    }

}
