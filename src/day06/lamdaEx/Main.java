package day06.lamdaEx;

public class Main {

    public static void main(String[] args) {
        Transformer<Integer, String> intToString = (input -> "Number: " + input + "\n");
        String result = intToString.transform(10);
        System.out.println(result.toString()); //함수형 인터페이스를 통해 int -> String 변환


        Transformer<String, Integer > stringToLength = (input) -> input.length();
        Integer length = stringToLength.transform("hello java programing)");
        System.out.println(length);
    }
}
