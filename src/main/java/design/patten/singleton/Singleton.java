package design.patten.singleton;

import database.redis.JedisSingleton;
import redis.clients.jedis.Jedis;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 15:33.
 * © All Rights Reserved.
 */
public class Singleton {


    // 查看JedisSingleton

    private static final Jedis jedis = JedisSingleton.getInstance();
}
