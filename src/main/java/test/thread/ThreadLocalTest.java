package test.thread;

public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("1001");
        threadLocal.set("1002");
    }

}
