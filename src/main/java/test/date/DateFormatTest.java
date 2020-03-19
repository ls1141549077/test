package test.date;

import lombok.SneakyThrows;

import java.util.Date;

public class DateFormatTest {
    /**
     * 1。SimpleDateFormat 以及 DateFormat 为线程不安全类
     * 2. jdk1.8 提供 LocalDate
     *
     */

    public static void main(String[] args) throws InterruptedException {
        for (int i=0 ; i < 10 ; i++){
            Thread t = new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    while(true){
                        // Date date = DateUtils.parseDate("2013-10-10 10:10:10");
                        // String newStr =   DateUtils.formatDate(date);
                        Date date = DateUtils.parseDateSafe("2013-10-10 10:10:10");
                        String newStr = DateUtils.formatDate(date);
                        if(!"2013-10-10 10:10:10".equals(newStr)){
                            System.out.println(newStr);
                        }
                    }

                }
            });
            t.start();
            t.join(2000);
        }


    }
}
