package test.javap;

public class JavapTest {

    public static int num = 10 ;
    public static void main(String[] args) {
        System.out.println("TEST JAVAP");
        incream();
    }

    public static synchronized void incream(){
        num++;
    }



}
