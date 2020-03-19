package test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread thread = new CallableThread();
        FutureTask task = new FutureTask(thread);
        Thread t1 = new Thread(task);
        t1.start();

        Object o = task.get();

        System.out.println(o);


    }
}
