package database.redis;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import redis.clients.jedis.Jedis;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 14:53.
 * © All Rights Reserved.
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JedisSingleton {


    private static Jedis jedis = null;

    private static class InsideSingleton {
        // default host is localhost
        private static Jedis jedisSingleton = new Jedis();
    }

    /**
     * 获取类实例的静态方法
     */
    public static Jedis getInstance() {
        if (jedis == null) {
            jedis = InsideSingleton.jedisSingleton;
        }
        return jedis;
    }

    /**
     * 序列化：保证序列化前后保持一致
     */
    public Object readResolve() {
        return jedis;
    }


    // 测试单例
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {

            int hashCode = JedisSingleton.getInstance().hashCode();
            Thread thread = new Thread(
                    () ->
                            System.out.println(JedisSingleton.getInstance().hashCode() == hashCode)
            );
            thread.start();
        }
    }

}
