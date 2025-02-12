package day07.sorting.comparator.student;

import lombok.Data;

@Data
public class Student  {

    private String name;
    private int sno;
    private Subject subject;


    private int total;
    private double avg;

    public Student(String name, int sno, Subject subject) {
        this.name = name;
        this.sno = sno;
       this.subject = subject;
        this.total = subject.total();
        this.avg = subject.average();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", subject=" + subject +
                ", total=" + total +
                ", avg=" + avg +
                '}';
    }


}
