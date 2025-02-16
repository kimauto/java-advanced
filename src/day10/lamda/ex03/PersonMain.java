package day10.lamda.ex03;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person();
        person.setA(1);
        person.setB(2);

        person.action((x,y) -> {
            double result = x + y;
            return result;
        });

        person.action((x,y) -> sum(x,y));
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
