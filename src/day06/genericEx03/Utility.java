package day06.genericEx03;

public class Utility {

    public static  <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"hello", "world"};

        printArray(strArray);

        Integer[] intArray = {1, 2, 3};
        printArray(intArray);
    }

}
