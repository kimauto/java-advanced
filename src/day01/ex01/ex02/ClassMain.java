package day01.ex01.ex02;

public class ClassMain {
    public static void main(String[] args) {

        Car mycar = new Car(new HankookTire(), new HankookTire());
        //자동차에 타이어를 장착
        mycar.run();


        //KumohoTire 교환
        mycar.changeTire(new KumhoTire(), new KumhoTire());

        mycar.run();
    }
}
