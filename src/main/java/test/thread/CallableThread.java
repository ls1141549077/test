package test.thread;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "OK!";
    }
}
