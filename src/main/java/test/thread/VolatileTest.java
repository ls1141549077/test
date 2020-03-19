package test.thread;

import lombok.SneakyThrows;

public class VolatileTest {
    // 原因是因为 ++ 是三个CPU指令操作 ： 1. 从内存中取出值  2.值+1  3.将新值会写主内存
    // 这三个操作 不具备原子性 ： 原子性 为 不可分割
    // 解决办法 ： 增加sychronized关键字 ， 防止多个线程同时 ++

    public static volatile int num = 0 ;
    /**
     *  验证 volatile 关键字的原子性
      * @param args
     */
    @SneakyThrows
    public static void main(String[] args) {

        new Thread(new IncreamThread()).start();
        new Thread(new IncreamThread()).start();

        Thread.sleep(500);
        System.out.println(num);
    }



}
class IncreamThread implements Runnable{
    @Override
    public void run() {
        for (int i=0 ; i < 100000 ; i++){
            synchronized (String.class){
                VolatileTest.num++;
            }

        }

    }
}