package day07.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //객체 저장
        map.put("이동휘", 1);
        map.put("김병곤", 2);
        map.put("신민혁", 3);
        System.out.println(map.size());
        System.out.println("===============================");

        //key값을 얻기
        String key = "신민혁";
        int value = map.get(key);
        System.out.println();

        //키 셋을 만듬
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
            Integer i = map.get(s);
            System.out.println(i);
        }
        System.out.println("=================================================");
        Iterator<String> keyiter = set.iterator();
        while (keyiter.hasNext()) {
                String k = keyiter.next();
                Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }

    }
}
