package day03.interfaceEx.test1;

public class Chicken extends Animal implements Cheatable{


    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hour) {
        setDistance(getDistance() + (getSpeed()*hour)); // 입력받은 시간만큼 이동해  원래 스피드에 hour을 인자 값으로 받아 원래 거리에 더해준다.
    }

    @Override
    public void fly() {
        setSpeed(getSpeed() * 2);
    }
}
