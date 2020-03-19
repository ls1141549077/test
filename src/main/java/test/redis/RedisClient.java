package test.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisClient {

    public static void main(String[] args) {
        JedisPoolConfig jcon = new JedisPoolConfig();
        jcon.setMaxTotal(200);
        jcon.setMaxIdle(50);
        jcon.setTestOnBorrow(true);
        jcon.setTestOnReturn(true);
        JedisPool jp = new JedisPool(jcon,"192.168.37.128",6379,30000);
        Jedis jedis = jp.getResource();


        String result = jedis.set("jedis", "hello world", "nx", "1000", 1000);
        System.out.println(result);

        String val = jedis.get("jedis");
        System.out.println(val);
        jedis.del("jedis");

        jedis.close();
        jp.close();
        System.out.println("finish");

    }


}
