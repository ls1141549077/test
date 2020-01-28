package test.thread;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("this Thread is :" + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end this Thread is :" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
