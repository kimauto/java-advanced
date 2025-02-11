package day06.genericEx03;


import java.util.List;

//Number 타입만 지원하는 제너릭클래스
public class NumberBox<T extends Number> {

    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }
    //상한 제한 와일드카드 (? extend T) 알려지지 않은 유형이 특정 타입 또는 제한
    public void printNumberList(List<? extends Number> list) {
        for (Number number1 : list) {
            System.out.println(number1);
        }
    }

    // 어떤 유형과도 함께 사용할 수 있도록 유연성 제공
    public void printList(List<?> list){
        for (Object number : list) {
            System.out.println(number);
        }
    }

    //하한 제한 와일드 카드(? super T) 특정 타입 또는 그 상위 클래스 중 하나를 허용
    public void addNumber(List<? super Integer> list) {
        list.add((int) number);
    }
}


