package day03.interfaceEx.test1;

public abstract class Animal {

    private int speed;
    private double distance;

    public Animal(int speed) {
        this.speed = speed;
    }
    public abstract void run(int hour);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
