package day05.innerclass.ex07;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student.StudentBuilder(1,"김병곤", "컴공")
                .setAddress("노원") .setPhoneNumber("01023121332").build();
        System.out.println(student1);


        Student student2 = new Student.StudentBuilder(1,"최문규", "컴공")
                .setAddress("강동구") .build();
        System.out.println(student2);



    }
}
