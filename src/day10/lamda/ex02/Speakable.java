package day10.lamda.ex02;

// 컨텐츠를 제공하면 컨텐츠를 읽어 오는 speak()메소드를 가지고 있는 함수형 인터페이스이입니다.
@FunctionalInterface
public interface Speakable {

    void speak(String contents);
}
