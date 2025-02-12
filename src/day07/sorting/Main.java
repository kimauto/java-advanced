package day07.sorting;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {

    public static void main(String[] args) {


        @Data
        class User implements Comparable<User>{
            String name;
            int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }


            @Override
            public int compareTo(User o) {
                if (this.age > o.age) return 1;
                else if (this.age == o.age)
                    if (this.name.compareTo(o.name) > 0) return 1;
                    else if (this.name.compareTo(o.name) == 0) return 0;
                    else return -1;
                else return -1;
            }
        }

        List<User> users = new ArrayList<User>();
        users.add(new User("홍길동", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        Collections.sort(users);
        users.forEach(System.out::println);

    }
}
