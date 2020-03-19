package test.gc;

/**
 * VM args : -Xss2M
 *
 * 引起电脑死机 ： 测不出 SOF
 */
public class SOFTest {

    public static void loop(){
        while (true){

        }
    }

    public static void recursion(){
        while (true){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    loop();
                }
            });
            t.start();
        }
    }


    public static void main(String[] args) {
        recursion();
    }
}
