package day07.sorting.comparator.student3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student implements Comparable<Student>  {

    private String name;
    private int sno;
    private List<Subject> subject = new ArrayList<>();
    private int total;
    private double average;


    public Student(String name, int sno, Subject subject) {
        this.name = name;
        this.sno = sno;
        this.subject.add(subject);
        this.total = subject.total();
        this.average = subject.average();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", subject=" + subject +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.average < o.average) return 1;
        else if (this.average == o.average)
            if (this.sno > o.sno) return 1;
            else if (this.sno == o.sno) return 0;
            else return -1;
        else return -1;
    }
}
