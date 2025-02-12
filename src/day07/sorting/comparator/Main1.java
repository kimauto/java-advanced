package day07.sorting.comparator;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {

    public static void main(String[] args) {


        @Getter
        class User {
           private String name;
           private int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }



        }

        List<User> users = new ArrayList<User>();
        users.add(new User("홍길동", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        Collections.sort(users, Comparator.comparing(User::getAge)); //나이순으로 정렬하겠다.
            for (User user : users) {
                System.out.println("user: " + user.name + ", age: " + user.getAge());
            }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Collections.sort(users, Comparator.comparing(User::getName).thenComparing(User::getAge)); //나이순으로 정렬하겠다.
            for (User user : users) {
                System.out.println("user: " + user.name + ", age: " + user.getAge());
            }


        };

    }

