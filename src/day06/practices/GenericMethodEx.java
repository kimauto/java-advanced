package day06.practices;
//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GenericMethodEx {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3 };
        printArray(intArray);
    }
}
