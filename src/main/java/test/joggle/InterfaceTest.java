package test.joggle;

/**
 * @Discription
 */
public class InterfaceTest {


    public static void main(String[] args) {
        Joggle joggle = new JoggleImpl();
        Integer integer = joggle.overrideFun(1);
        String s = joggle.overrideFun(1, "2");
        System.out.println(integer);
        System.out.println(s);
    }

}
