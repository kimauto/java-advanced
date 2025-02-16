package day10.lamda.ex01;

@FunctionalInterface
public interface Calculable {
    //반드시 추상 메소드 하나
    void calculate(int x, int y);
}
