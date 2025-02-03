package day01.ex02;

import java.util.ArrayList;

class Shape{}
class Rectangle extends Shape{}
class Triangle extends Shape{}

class Circle extends Shape {

}

public class ShapeMain {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.forEach(each -> System.out.println(each));

    }
}
