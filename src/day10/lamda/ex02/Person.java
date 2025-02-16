package day10.lamda.ex02;

import day10.lamda.ex02.Workable;

public class Person {
    private String name;
    private String job;
    private String contents;
    private String singSubject;

    public Person(String name, String job, String contents, String singSubject) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.singSubject = singSubject;
    }

    public void action3(Singable singable){
        singable.sing(singSubject);
    }

    public void action2(Speakable speakable){
        speakable.speak(contents);
    }

    public  void action(Workable workable){

        workable.work(name, job);
    }
}

