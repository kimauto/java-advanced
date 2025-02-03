package day01.todayTest.st1;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(super.getName() + "의 면적은 " + radius*radius*super.getArea());
    }
}
