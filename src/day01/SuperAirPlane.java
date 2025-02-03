package day01;

public class SuperAirPlane extends AirPlane{

    public static final int NORMAL = 1;
    public static final int ADVANCED = 2;

    public int flyMode = NORMAL;


    @Override
    public void fly() {
        if (flyMode == ADVANCED){
            System.out.println("초고속 비행");
        }else{
            super.fly();}

    }
}
