package day05.innerclass.ex07;


import lombok.Builder;
import lombok.NonNull;


public class Student {

    private int id;
    private String name;
    private String major;

    //선택멤버
    private  String grade;
    private  String phoneNumber;
    private  String address;


    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.major = studentBuilder.major;
        this.grade =  "freshman";

    }
    public static class StudentBuilder {

        private int id;
        private String name;
        private String major;

        //선택멤버
        private  String grade;
        private  String phoneNumber;
        private  String address;

        public StudentBuilder(int id, String name, String major){
            this.id = id;
            this.name = name;
            this.major = major;
        }
        public StudentBuilder setGrade(String grade){
            this.grade = grade;
            return this;
        }
        public StudentBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public StudentBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public Student build() {return new Student(this);}

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
