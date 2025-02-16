package day10.lamda.ex03;


public class Person {
     private int A;
     private int B;

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public void action(Calculable calculable){
        double result = calculable.calculate(A, B);
        System.out.println("결과 " + result);
        }

}

