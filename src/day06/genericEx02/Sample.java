package day06.genericEx02;

public class Sample {
    public static <T> void printValue(T value){
        System.out.println(value);
    }


    public static void main(String[] args) {
        printValue(1);
        printValue("김병곤");
    }
}
