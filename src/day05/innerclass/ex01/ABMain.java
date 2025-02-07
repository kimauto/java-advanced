package day05.innerclass.ex01;

public class ABMain {

    public static void main(String[] args) {

        A a = new A();

        A.B b = a.new B();

    }
}
