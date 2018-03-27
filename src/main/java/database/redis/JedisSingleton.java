package database.redis;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import redis.clients.jedis.Jedis;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 14:53.
 * © All Rights Reserved.
 * <p>
 * 单例模式
 * 1- 类只能被创建一次，减少系统开销
 * 2- 不需要new操作符，降低系统内存使用频率，减轻GC压力
 * 3- 保证每一个操作都是由这个类来操作的
 */

// 防止被实例化的私有构造方法
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JedisSingleton {


    /**
     * 私有的静态实例除了提供返回之外，还有一个作用是为了防止被引用
     * 等于null是为了在类初始化的时候不着急加载此类，而是在需要使用的时候才加载，以实现延迟加载
     */
    private static Jedis jedis = null;

    /**
     * 使用一个静态内部类来创建类的实例，这样做可以保证在多线程环境下不会出现对象没有被初始化的问题
     * JVM的内部机制可以保证在加载类的时候线程互斥，所以当singleton 引用为null的时候，JVM能保证Singleton类的对象只被创建一次
     * 另外，JVM的互斥机制还使得getInstance()方法不需要加锁，保证了性能要求
     */
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
