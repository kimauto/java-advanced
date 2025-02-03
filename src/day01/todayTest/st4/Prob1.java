package day01.todayTest.st4;

public class Prob1 {
    public static void main(String[] args) {
        Truck truck = new Truck("트럭",100,4);

        Bike bike = new Bike("자전거",25,2);

        wheelNumber(truck);
        wheelNumber(bike);

        speed(truck);
        speed(bike);

        truck.speedDown(50);
        bike.speedDown(10);

        truck.stop();
        bike.stop();

        truck.setVelocity(50);
        System.out.println("트럭의 현재 속도는 " + truck.getVelocity() + "입니다.");


    }

    public static void speed(Wheeler wheeler) {
        System.out.println(wheeler.carName + "의 현재 속드는 " + wheeler.velocity + "입니다.");
    }
    public static void wheelNumber(Wheeler wheeler) {
        System.out.println(wheeler.carName + " : 바퀴 " + wheeler.wheelNumber + "개입니다.");
    }
}
