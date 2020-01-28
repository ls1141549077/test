package test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static String formatStr = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
    public static String formatDate(Date date){
        return simpleDateFormat.format(date);
    }

    public static Date parseDate(String dateStr)  throws Exception{
       return simpleDateFormat.parse(dateStr);
    }

}
