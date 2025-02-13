package day08.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        //엔트리 저장
        map.put("apple", 1000);
        map.put("banana", 4000);
        map.put("grape", 5000);
        map.put("melon", 3000);
        map.put("pear", 2000);

        //정렬된 엔트리 가져오기
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        //툭정 키에대한 값을 가져오고 싶다
        Map.Entry<String, Integer> entry = null;
        entry = map.firstEntry();

        //내림차순으로 정렬하기
        NavigableMap<String, Integer> descendingMap = map.descendingMap();
        Set<Map.Entry<String, Integer>> descendingSet = descendingMap.entrySet();
        for(Map.Entry<String,Integer> e : descendingSet) System.out.println(e);
    }
}
