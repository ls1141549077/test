package test;

import com.google.common.collect.EvictingQueue;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Discription
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String testStr = "0";
        String[] quantityArray = testStr.split(",");
        System.out.println( new BigDecimal(quantityArray[0]));;

        System.out.println( new BigDecimal(quantityArray[0]).equals(BigDecimal.ZERO));;

        System.out.println(Double.valueOf(quantityArray[0]) == 0d);
        System.out.println(new BigDecimal(quantityArray[0]).compareTo(BigDecimal.ZERO)==0);
    }
}
