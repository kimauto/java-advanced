package day06.genericEx04;

public class Applicant<T> {

    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}
