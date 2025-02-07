package day05.innerclass.ex02;

public class Creature2 {

    int life = 100;

    //private 클래스는 오로지 creature2 외부에서만 접근 가능 내부 클래스
    private class Animal2{
        private String name = "Tiger";

        int getOuter() {
            return life;
        }
    }
    public void method(){
        Animal2 animal1 = new Animal2();

        System.out.println(animal1.name);
        System.out.println(animal1.getOuter());
    }


    public static void main(String[] args) {
        Creature2 creature2 = new Creature2();
        creature2.method();

    }
}
