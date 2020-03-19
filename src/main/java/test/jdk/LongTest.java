package test.jdk;

public class LongTest {

    public static void main(String[] args) {
        Long l1 = new Long(1);
        Long l2 = new Long(1);

        Long l3 = 127L ;
        Long l4 = 127L ;

        Long l5 = 128L ;
        Long l6 = 128L ;


        System.out.println(l1 == l2);
        System.out.println(l3 == l4);
        System.out.println(l5 == l6);

    }


}
