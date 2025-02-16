package day10.lamda.ex04;


import day10.lamda.ex03.Calculable;

public class Person {



    public void action(Calculable calculable){
        double result = calculable.calculate(20, 14);
        System.out.println("결과 " + result);
        }

}

