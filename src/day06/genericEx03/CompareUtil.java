package day06.genericEx03;

public class CompareUtil {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {

        System.out.println(max(1, 2));
    }
}
