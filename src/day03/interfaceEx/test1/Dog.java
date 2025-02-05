package day03.interfaceEx.test1;

public class Dog extends Animal{



    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hour) {
        setDistance(getDistance() + (getSpeed()*((double) hour / 2))); //  1/2 시간만 이동
    }
}
