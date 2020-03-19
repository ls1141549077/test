package test.jdk;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class IntTest {
    public static void main(String[] args) {
        // New 对象的永远  == 判断一定是false
        // 直接赋值 ， == 在 -128 ~ 127  之间存在缓存

        Integer i = new Integer(1);
        Integer i2 = new Integer(1);

        Integer i3 = new Integer(777) ;
        Integer i4 = new Integer(777) ;

        Integer i5 = 127 ;
        Integer i6 = 127 ;

        Integer i7 = 128 ;
        Integer i8 = 128 ;

        System.out.println(i.equals(i2) );
        System.out.println(i == i2 );
        System.out.println("-------------");
        System.out.println(i3.equals(i4));
        System.out.println(i3 == i4);
        System.out.println("-------------");
        System.out.println(i5 == i6 );
        System.out.println(i5.equals(i6));
        System.out.println("--------------");
        System.out.println(i7==i8);
        System.out.println(i7.equals(i8));



    }
}
