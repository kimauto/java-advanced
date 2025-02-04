package day02.exception;

public class Exception01 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작\n");

        printLength("This is Java Programming Exception");
        printLength(null);
        System.out.println("프로그램 종료");

    }

    public static void printLength(String data){
        int result = 0;
        try {
            result = data.length();
        } catch (Exception e) {
//            System.out.println(e.getMessage()); //예외를 얻는 방법1
//            System.out.println(e.toString()); //예외를 얻는 방법2
            e.printStackTrace(); //예외를 얻는 방법3 <- 선호하는 방식
        } finally {
            System.out.println("마무리 실행");
        }
        System.out.println("문자의 수 :" + result);
    }

}
