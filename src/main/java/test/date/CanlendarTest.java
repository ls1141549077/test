package test.date;

import java.util.Calendar;

/**
 * @author YSH
 * @ClassName CanlendarTest
 * @Discription
 * @date 2019/5/23 0023
 */
public class CanlendarTest {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_YEAR , -30);
        System.out.println(String.valueOf(instance.getTimeInMillis()));
    }

}
