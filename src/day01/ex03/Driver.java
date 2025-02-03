package day01.ex03;

public class Driver {

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Taxi || vehicle instanceof  Bus){
            vehicle.run();

        }else {
            System.out.println("자격이 없습니다.");
        }
    }
}
