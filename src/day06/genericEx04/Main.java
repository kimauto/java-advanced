package day06.genericEx04;

public class Main {
    public static void main(String[] args) {

        // 모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<>(new Person()));
        Course.registerCourse1(new Applicant<>(new Worker()));
        Course.registerCourse1(new Applicant<>(new Student()));
        Course.registerCourse1(new Applicant<>(new HighStudent()));
        Course.registerCourse1(new Applicant<>(new MiddleStudent()));

        System.out.println("===========================================");

        Course.registerCourse2(new Applicant<>(new MiddleStudent()));
        Course.registerCourse2(new Applicant<>(new HighStudent()));

        System.out.println("===========================================");

        Course.registerCourse3(new Applicant<>(new Worker()));
        Course.registerCourse3(new Applicant<>(new Person()));




    }
}
