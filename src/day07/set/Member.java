package day07.set;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //name과 age가 같다면 true 리턴
        if(o instanceof Member target) {
            return target.name.equals(this.name) && target.age == this.age;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        //name과 age가 값이 같으면 동일한 hashCode값 리턴
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
