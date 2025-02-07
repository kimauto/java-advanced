package day05.innerclass.ex05.refact;

class A {

    void useB() {
        class B {
            int field1 = 10;
            static int field2 = 20;

            public B() {
                System.out.println("B생성자 실행");
            }

            void method1() {
                System.out.println("B metho1 실행");
            }

            static void method2() {
                System.out.println("B static method2 실행");
            }

        }
        B b = new B();
        b.method1();

    }
}
public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
    }
}
