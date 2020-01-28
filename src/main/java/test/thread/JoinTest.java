package test.thread;

public class JoinTest {
    /**
     * 测试 线程的 join 实际调用
     * 1. 调用wait方法 wait时间为传入参数
     * 2. 执行 join的线程
     * 3. 如果CPU有空闲资源 ， 会在wait等待时间过后同时执行 两个线程
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
            Thread t = new Thread(new RunnableThread());
            Thread t2 = new Thread(new RunnableThread());
            t.start();
            t2.start();
            t2.join(1000);
    }
}
