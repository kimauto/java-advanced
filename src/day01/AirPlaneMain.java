package day01;

public class AirPlaneMain {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        airPlane.takeOff();
        airPlane.fly();
        airPlane.land();

        SuperAirPlane superAirPlane = new SuperAirPlane();
        superAirPlane.takeOff();
        superAirPlane.flyMode = SuperAirPlane.ADVANCED;
        superAirPlane.fly();
        superAirPlane.land();

    }
}
