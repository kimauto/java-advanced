package day07.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("김병곤");
        set.add("java");
        set.add("java");
        set.add("perfect");
        set.add("spring");

        //저장된 객체 수 확인
        int size = set.size();
        System.out.println(size);
    }
}
