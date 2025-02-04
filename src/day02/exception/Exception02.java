package day02.exception;

public class Exception02 {

    public static void main(String[] args) {
        String[] stringArray = {"100", "1oo",null };
        for (int i = 0; i < stringArray.length + 1; i++) {
            try {
                int value = Integer.parseInt(stringArray[i]);
            } catch (ArrayIndexOutOfBoundsException  e) {
                System.out.println("배열의 인덱스가 초과되었습니다." + e.getMessage());
            }catch (NumberFormatException  | NullPointerException e2) {
                System.out.println("숫자로 변환할 수 없는 데이터입니다." + e2.getMessage() );
            }catch (Exception e) {
                System.out.println("실행에 문제가 발생했습니다." + e.getMessage());
            }
        }

    }


}
