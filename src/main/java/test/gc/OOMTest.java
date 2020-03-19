package test.gc;

import java.util.ArrayList;
import java.util.List;

public class OOMTest {
    /**
     * VM args
     * -verbose:gc -Xms10M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError
     *
     *  最后产生的DUMP 文件存在于 项目根目录
     * @param args
     */

    public static void main(String[] args) {
        List<Byte[]> list = new ArrayList<>();
        int i = 1 ;
        while (true){
            Byte[] bytes = new Byte[1*1024*1024];
            list.add(bytes);
            System.out.println("now count :" + i++ );
        }



    }
}
