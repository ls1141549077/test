package test.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(50 , 100 ,
                3000, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(50));
    }
}
