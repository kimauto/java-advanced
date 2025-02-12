package day07.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {

        Set<Member> members = new HashSet<>();

        //회원 가입해서 정보 저장
        members.add(new Member("홍길동", 30));
        members.add(new Member("홍길똥", 30));
        members.add(new Member("홍길순", 30));
        members.add(new Member("홍길길", 30));
        members.add(new Member("홍길박", 30));


        // 객체를 반복자 Iterator 을 이용하여 처리
        Iterator<Member> iterator = members.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
            iterator.remove();
            int size = members.size();
            System.out.println(size);
        }
        System.out.println("=======================================");

        for (Member member : members) {
            System.out.println(member);
        }

    }
}
