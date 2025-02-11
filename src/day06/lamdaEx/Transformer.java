package day06.lamdaEx;

// Transformer 제너릭 함수형 인터페이스0
@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T input);
}


