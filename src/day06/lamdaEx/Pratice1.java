package day06.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class Pratice1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김병곤", "황인규", "김윤서");
        names.forEach(name -> System.out.println(name + " "));
    }
}
