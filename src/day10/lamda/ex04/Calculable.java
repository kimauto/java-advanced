package day10.lamda.ex04;

@FunctionalInterface
public interface Calculable {
    //반드시 추상 메소드 하나
    double calculate(double x, double y);
}
