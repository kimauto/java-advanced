package day07.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductTest {

    public static void main(String[] args) {
        Product p1 = new Product("갤럭시S25", 1200000);
        Product p2 = new Product("아이폰15Pro", 1370000);
        Product p3 = new Product("LG폰", 1000000);
        Product p4 = new Product("갤럭시S25(중고)", 1000000);
        Product p5 = new Product("아이폰15Pro(중고)", 100000);
        Product p6 = new Product("LG폰", 900000);



        //List 사용

        List<Product> list = new ArrayList<Product>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        System.out.println("list 정렬  전");
        list.forEach(s -> System.out.println(s));

        Collections.sort(list);
        System.out.println("list 정렬 후");
        list.forEach(s -> System.out.println(s));

        //배열[] 사용
        Product[] pArr = {p1, p2, p3, p4, p5, p6};
        System.out.println("배열정렬 전");
        Arrays.stream(pArr).forEach(System.out::println);

        Arrays.sort(pArr);
        System.out.println("배열정렬 후");
        Arrays.stream(pArr).forEach(System.out::println);
    }
}
