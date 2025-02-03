package day01;

import com.sun.source.tree.NewArrayTree;

public class SmartPhoneMain {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("갤럭시", "white");

        System.out.println(smartPhone.model);
        System.out.println(smartPhone.color);

        System.out.println(smartPhone.wifi);


        smartPhone.bell();

        smartPhone.setWifi(true);



    }
}
