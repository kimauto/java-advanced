package day01;

public class SportsCar extends Car{

    public SportsCar(int speed) {
        super(speed);
    }

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 10);
    }
}
