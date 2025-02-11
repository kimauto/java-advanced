package day06.genericEx04;

public class Course {

    //사람이면 수강등록 가능
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 동록함");
    }

    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course2을 동록함");

    }

    // 직장인 및 일반인 등록 가능
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 동록함");

    }
}
