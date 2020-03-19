package test.jdk;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        testConcurrentHashMap();
        testHashMap();
    }


    public static void testConcurrentHashMap(){
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("1",1);
        System.out.println(map.get("1"));
    }

    public static void testHashMap(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("1",null);
        System.out.println(map.get("1"));
    }

    public static void testTreeMap(){
        TreeMap<String,Integer> treeMap = new TreeMap<>();






    }



}
