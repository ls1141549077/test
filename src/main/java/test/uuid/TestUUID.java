package test.uuid;

import java.util.UUID;

/**
 * @Discription
 */
public class TestUUID {

    public static void main(String[] args) {
       Thread t1 = new Thread(new Uid());
       Thread t2 = new Thread(new Uid());
       Thread t3 = new Thread(new Uid());
       Thread t4 = new Thread(new Uid());
       Thread t5 = new Thread(new Uid());
       Thread t6 = new Thread(new Uid());
       Thread t7 = new Thread(new Uid());
       Thread t8 = new Thread(new Uid());
       Thread t9 = new Thread(new Uid());
       Thread t10 = new Thread(new Uid());

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
       t6.start();
       t7.start();
       t8.start();
       t9.start();
       t10.start();



    }

    static class Uid implements Runnable{

        @Override
        public void run() {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }



}
