package day01;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car(3);
        System.out.println(car.getSpeed());
        car.speedUp();
        System.out.println(car.getSpeed());

        SportsCar sportsCar = new SportsCar(50);
        System.out.println(sportsCar.getSpeed());
        sportsCar.speedUp();
        System.out.println(sportsCar.getSpeed());

    }
}
