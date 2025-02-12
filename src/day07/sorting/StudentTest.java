package day07.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        Student 철수 = new Student(250123, "김철수");
        Student 영희 = new Student(240867, "최영희");
        Student 동이 = new Student(240867, "김동이");

        int isBig = 철수.compareTo(영희);
        System.out.println(isBig);

        List<Student> students = new ArrayList<Student>();
        students.add(철수);
        students.add(영희);
        students.add(동이);

        Collections.sort(students);
        System.out.println(students);
        students.forEach(System.out::println);
    }
}
