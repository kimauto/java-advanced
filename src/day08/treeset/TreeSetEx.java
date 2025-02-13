package day08.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //TreeSet 컬렉션
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(64);
        scores.add(42);
        scores.add(53);

        for (Integer score : scores)
            System.out.println(score);
        System.out.println("우리반 꼴등 : " + scores.first());


        //내림차순 정렬하기
        NavigableSet<Integer> descScores = scores.descendingSet();
        for(Integer s : descScores) System.out.println(s + "점");
        System.out.println();
        //점수기준 범위 검색   (80 <= )
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for(Integer s : rangeSet) System.out.println(s + "점");

        System.out.println();
        //범위 검색  ( 80 <= score <90)
        rangeSet = scores.subSet(80,true,90,false);
        for(Integer s : rangeSet) System.out.println(s + "점");

    }
}
