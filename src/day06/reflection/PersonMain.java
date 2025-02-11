package day06.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMain {

    public static void main(String[] args) throws Exception{
        //클래스 객체를 가져오기 ( Class.forName() 메소드 방식 )
        Class<Person> personClass = (Class<Person>) Class.forName("day06.reflection.Person");

        //생성자 가져오기 - person(string name , int age)
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        //가져온 생성자로 인스턴스 만들기
        Person p1 = constructor.newInstance("신세계", 30);
        p1.getField();

        //접근 제한자 public, public static, private Method
        Method total = personClass.getMethod("total", int.class , int.class);
        int result = (int)total.invoke(new Person(), 10, 20);
        System.out.println("result = " + result);


        //특정 static 메서드 가져와 실행
        Method staticTotal = personClass.getMethod("staticTotal", int.class, int.class);
        int staticResult = (int)staticTotal.invoke(null,100,200);
        System.out.println("staticResult : " + staticResult);

        //특정 private 메소드 가져와 실행
        Method privateTotal = personClass.getDeclaredMethod("privateTotal", int.class, int.class);
        privateTotal.setAccessible(true);  //외부에서 접근할 수 있도록 설정
        int privateResult = (int) privateTotal.invoke(new Person(),200,300);
        System.out.println("privateTotal :" + privateResult);

    }
}
