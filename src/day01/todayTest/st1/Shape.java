package day01.todayTest.st1;

public abstract class Shape {

    private final double area = 3.14;
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }
    public abstract void calculateArea();
    public void print(){};


    public double getArea() {
        return area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
