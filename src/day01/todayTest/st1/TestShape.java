package day01.todayTest.st1;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shape = new Shape[2];

        shape[0] = new Circle("원",10);
        shape[1] = new Rectangular("직사각형",2,100);

        cal(shape);

    }
    public static void cal(Shape [] shape) {
        for (Shape shape1 : shape) {
            shape1.calculateArea();
        }
    }
}
