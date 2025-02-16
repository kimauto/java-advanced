package day10.lamda.ex02;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person("황가람", "가수", "여러분을 만날떄까지 너무 오래거렸어요. 만나서 반갑습니다.","반딧불");
        Person person2 = new Person("조수미", "가수", "저를 오랫동안 사랑해주셔서 감사합니다.","밤의 아리아");

        person1.action(
                ((name, job) -> System.out.println(name +"은 " + job + "입니다."))
        );
        person1.action2(
                (contents -> System.out.println(contents))
        );
        person1.action3(
                (singSubject -> System.out.println(singSubject +"를 부릅니다."))
        );

        person2.action(
                ((name, job) -> System.out.println(name +"은 " + job + "입니다."))
        );
        person2.action2(
                (contents -> System.out.println(contents))
        );
        person2.action3(
                (singSubject -> System.out.println(singSubject +"를 부릅니다."))
        );


    }


}
