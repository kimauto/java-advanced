package day07.sorting.comparator.student2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject  {

    private int korean;
    private int english;
    private int math;

    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }


    public  int total() {
        return korean + english + math;
    }

    public double average() {
        return (double) total() / 3;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }
}
