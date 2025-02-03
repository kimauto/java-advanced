package day01.todayTest.st1;

public class Rectangular extends Shape {
    private double width;
    private double hight;

    public Rectangular(String name, double width, double hight) {
        super(name);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public void calculateArea() {
        System.out.println(super.getName()+"의 면적은 " + (width * hight));
    }
}
