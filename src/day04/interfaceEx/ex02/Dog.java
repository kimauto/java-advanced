package day04.interfaceEx.ex02;

public class Dog implements SoundAble {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
