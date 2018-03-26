package database.redis;

import lombok.SneakyThrows;
import redis.clients.jedis.Jedis;

/**
 * Created by 谭健 on 2018/3/22 0022. 15:45.
 * © All Rights Reserved.
 */


public class AboutJedis {


    public static void main(String[] args) {


        //      testSpeed();


        //     test();


        //   timeout();

    }


    private static void testSpeed() {

        long endTime = System.currentTimeMillis() + 1000;
        Jedis jedis = JedisSingleton.getInstance();

        int count = 0;


        for (; endTime > System.currentTimeMillis(); ) {

            // 因为受到System.currentTimeMillis() 的时间影响，结果会偏低

            //    jedis.hgetAll("userHashMap");  52000
            //    jedis.get("now_time");  54000
            //    jedis.set("now_time", "" + System.currentTimeMillis()); 51000
            count++;
        }
        System.out.println(count);
    }


    @SneakyThrows(Exception.class)
    private static void timeout() {

        Jedis jedis = JedisSingleton.getInstance();

        jedis.setex("temp", 3, "success.");

        String temp = jedis.get("temp");
        System.out.println(jedis.keys("*"));
        System.out.println(temp);

        Thread.sleep(3001);
        temp = jedis.get("temp");

        System.out.println(temp);

        System.out.println(jedis.keys("*"));
    }


    private static void test() {

        // 你需要搭建一个本地的Redis数据库


        Jedis jedis = JedisSingleton.getInstance();

        System.out.println(jedis.ping());

        System.out.println(jedis.hgetAll("userHashMap"));

        System.out.println(jedis.get("now_time"));

        System.out.println(jedis.smembers("nameSet"));

        System.out.println(jedis.zrangeByScore("nameZSet", 0, 10));

        System.out.println(jedis.lrange("userList", 0, 10));

        System.out.println(jedis.type("userList"));
    }
}
