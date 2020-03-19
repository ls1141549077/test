package test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static String formatStr = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);

    /**
     * 非线程安全
     */
    public static String formatDate(Date date){
        return simpleDateFormat.format(date);
    }
    /**
     * 非线程安全
     */
    public static Date parseDate(String dateStr)  throws Exception{
       return simpleDateFormat.parse(dateStr);
    }

    // ===== 线程安全 ======
    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();
    public static final String format = "yyyy-MM-dd HH:mm:ss";
    public static SimpleDateFormat getDateFormat(){
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if(simpleDateFormat == null){
            simpleDateFormat = new SimpleDateFormat(format);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat ;
    }

    /**
     * 线程安全使用变量副本
     * @param date
     * @return
     */
    public static String formatDateSafe(Date date){
        return getDateFormat().format(date);
    }

    public static Date parseDateSafe(String dateStr)  throws Exception{
        return getDateFormat().parse(dateStr);
    }


}
