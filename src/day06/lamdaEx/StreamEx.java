package day06.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hellokimads", "dsadsaworld", "hello", "rld");

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(filteredWords);
    }
}
