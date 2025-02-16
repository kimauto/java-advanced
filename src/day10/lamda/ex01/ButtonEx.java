package day10.lamda.ex01;

public class ButtonEx {

    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(
                () -> System.out.println("버튼이 클릭 되었습니다.")
        );

        button.click(); // 버튼이 클릭되었습니다.

        Button canclebutton = new Button();

        canclebutton.setClickListener(
                () -> System.out.println("취소버튼이 클릭 되었습니다.")
        );

        canclebutton.click(); // 버튼이 클릭되었습니다.
    }


}




