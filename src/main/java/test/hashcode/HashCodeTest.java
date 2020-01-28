package test.hashcode;

import com.google.common.collect.EvictingQueue;
import test.domain.Person;

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
public class HashCodeTest {
    static Person p1 ;
    static Person p2 ;
    static Person p3 ;

    static {
        p1 = new Person() ;
        p1.setAge(14);
        p1.setName("南山");

        p2 = new Person() ;
        p2.setAge(15);
        p2.setName("李白");

        p3 = new Person() ;
        p3.setAge(15);
        p3.setName("李白");
    }

    public static void main(String[] args) throws IOException {
        // 测试HASHCODE
        //  测试结果 属性一样 HASHCODE 一定相同
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

    }
}
