package day07.board;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static  void main(String[] args) {
        //ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<String>();

        //LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        //시작시간, 끝 시간을 저장 변수 선언
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList", (endTime - startTime));
    }
}
