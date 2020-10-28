package test.jdk;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTets {

    public static void main(String[] args) {
        String S1 = "999999999922222222222222222299999999999999999955.2";
        BigDecimal b1 = new BigDecimal(S1);


        DecimalFormat df = new DecimalFormat("00.00");
        String format = df.format(b1);
        System.out.println(format);


        //
        Double D1 = b1.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(D1);

        String  s = b1.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(s);

        String ps = b1.setScale(2,BigDecimal.ROUND_HALF_UP).toPlainString();
        System.out.println(ps);

    }

}
