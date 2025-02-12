package day07.sorting;

import lombok.Data;



@Data
public class Student implements Comparable<Student> {

    private int sno;
    private String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.sno > o.sno) return 1;
        else if(this.sno == o.sno)
            if (this.name.compareTo(o.name) > 0) return 1;
            else if(this.name.compareTo(o.name) == 0) return 0;
            else return -1;
        else return -1;

//        return this.sno - o.sno;
    }
}
