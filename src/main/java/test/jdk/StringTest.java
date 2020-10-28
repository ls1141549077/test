package test.jdk;

import java.util.ArrayList;
import java.util.List;

public class StringTest {


    public static void main(String[] args) {
        int i = 10;
        String iStr = String.format("%010d",i);

       Integer integer =  Integer.valueOf(iStr);


        System.out.println(integer);

        System.out.println(4|3);


        List<String> list = new ArrayList<>();
        String[] strArr = new String[4];
        System.out.println(strArr);

        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        String[] strArr2 = new String[0];
        System.out.println(strArr2);
        strArr = list.toArray(strArr2);


        System.out.println(strArr);


    }

}
