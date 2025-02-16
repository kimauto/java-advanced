package day10.lamda.ex01;

public class WorkMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(
                () -> {
                    System.out.println("9시 까지 출근을 해야합니다.");
                    System.out.println("9시 ~ 11시 50분까지 오전업무 시작.");
                    System.out.println("12시 ~ 어흐 1시까지 점심시간입니다.");
                }

        );

        person.action(() -> System.out.println("주말엔 축구 동호회에 가서 열심히 공을 찹니다."));
    }
}
