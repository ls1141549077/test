package test.thread;

public class ActiveThreadTest {

    public static void main(String[] args) {
        // 初始 Thread.activeThread 为2 是因为idea 存在的线程影响
        System.out.println("start active count : " + Thread.activeCount());
        Thread t1 = new Thread(new RunnableThread());
        Thread t2 = new Thread(new RunnableThread());
        t1.start();
        t2.start();
        // activeThread 为 4 是 ：main  ，idea线程 ， thread0 线程 ， thread1线程
        System.out.println("end active count : " + Thread.activeCount());
    }
}
