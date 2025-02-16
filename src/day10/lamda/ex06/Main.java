package day10.lamda.ex06;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.getMember1(Member::new);
        person.getMember2(Member::new);
    }
}
