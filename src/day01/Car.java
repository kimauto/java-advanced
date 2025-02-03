package day01;

public class Car {

    private int speed;

    public Car(int speed) {
        System.out.println("차를멈춤");
        this.speed = speed;
    }

    public final void stop(){
        System.out.println("차를 멈춘다.");
        speed = 0;
    }

    public void speedUp(){
        speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
