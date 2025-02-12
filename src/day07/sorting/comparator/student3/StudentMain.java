package day07.sorting.comparator.student3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        Subject subject = new Subject(70, 80, 90);
        Subject subject1 = new Subject(90, 100, 80);
        Subject subject2 = new Subject(70, 90, 70);
        Subject subject3 = new Subject(70, 90, 70);

        Student 김병곤 = new Student("김병규", 20251111, subject );
        Student 최문규 = new Student("최문규", 20251212, subject1 );
        Student 김덕규 = new Student("김덕규", 20251313, subject2);
        Student 조덕규 = new Student("조덕규", 20251414, subject3);

        List<Student> students = new ArrayList<Student>();
        students.add(김병곤);
        students.add(최문규);
        students.add(김덕규);
        students.add(조덕규);


        Collections.sort(students); //학번으로 정렬
        for (Student student : students) {
            System.out.print("이름 : " + student.getName() + " 학번 : " + student.getSno());
            System.out.printf(" 총점 : %d 평균 : %.2f\n", student.getTotal(), student.getAverage());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(students, Comparator.comparing(Student::getTotal).thenComparing(Student::getSno)); //학번 이름 정렬
        for (Student student : students) {
            System.out.print("이름 : " + student.getName() + " 학번 : " + student.getSno());
            System.out.printf(" 총점 : %d 평균 : %.2f\n", student.getTotal(), student.getAverage());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"); // 내림차순
        Collections.sort(students, Comparator.comparing(Student::getTotal).reversed());
        for (Student student : students) {
            System.out.print("이름 : " + student.getName() + " 학번 : " + student.getSno());
            System.out.printf(" 총점 : %d 평균 : %.2f\n", student.getTotal(), student.getAverage());
        }
    }
}
