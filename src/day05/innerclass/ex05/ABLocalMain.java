package day05.innerclass.ex05;

class A{

    public A() {
        class B{}
        B b = new B();
    }

    void method(){
        class B{}
        B b= new B();
    }

}

public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
