package database.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by 谭健 on 2018/3/22 0022. 15:45.
 * © All Rights Reserved.
 */


public class AboutJedis {


    public static void main(String[] args) {


        testSpeed();


        test();

    }


    private static void testSpeed() {

        long endTime = System.currentTimeMillis() + 1000;
        Jedis jedis = new Jedis();

        int count = 0;

        for (; endTime > System.currentTimeMillis(); ) {
            //    jedis.hgetAll("userHashMap");  52000
            //    jedis.get("now_time");  54000
            //    jedis.set("now_time", "" + System.currentTimeMillis()); 51000
            count++;
        }
        System.out.println(count);
    }

    private static void test() {

        // 你需要搭建一个本地的Redis数据库

        // default host is localhost
        Jedis jedis = new Jedis();

        System.out.println(jedis.ping());

        System.out.println(jedis.hgetAll("userHashMap"));

        System.out.println(jedis.get("now_time"));

        System.out.println(jedis.smembers("nameSet"));

        System.out.println(jedis.zrangeByScore("nameZSet", 0, 10));

        System.out.println(jedis.lrange("userList", 0, 10));

        System.out.println(jedis.type("userList"));
    }
}
