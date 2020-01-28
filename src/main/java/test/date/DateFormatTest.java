package test.date;

public class DateFormatTest {
    /**
     * 1。SimpleDateFormat 以及 DateFormat 为线程不安全类
     * 2. jdk1.8 提供 LocalDate
     *
     */

    public static void main(String[] args) {
        for (int i=0 ; i < 10 ; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();
        }


    }
}
