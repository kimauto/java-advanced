package day01.ex01;

public class ClassMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        //hankook으로 교환
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
