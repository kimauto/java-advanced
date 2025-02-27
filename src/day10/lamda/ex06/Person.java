package day10.lamda.ex06;

public class Person {

        public  Member getMember1(Creatable creatable){
            String id = "ssg1";
            Member member = creatable.create(id);
            return member;
        }

    public Member getMember2(Creatable2 creatable2) {
        String id = "ssg2";
        String name = "신세계";
        Member member = creatable2.create(id, name);
        return member;
    }

}
