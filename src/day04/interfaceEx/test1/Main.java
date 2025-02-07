package day04.interfaceEx.test1;

public class Main {

    public static void main(String[] args) {

        A b = new B();
        A c = new C();

       action(b);
       action(c);

    }
    public static void action(A a) {

        a.method1();
        if (a instanceof C c) {
            c.method2();
        }
    }
}
