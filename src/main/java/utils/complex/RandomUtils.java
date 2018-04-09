package utils.complex;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Created by 谭健 on 2018/3/30 0030. 星期五. 10:54.
 * © All Rights Reserved.
 *
 * 使用Random 会因为争用同一个seed导致性能低下
 * ThreadLocalRandom 从JDK 1.7开始
 * ThreadLocalRandom 线程安全
 * ThreadLocalRandom 性能比Random在多线程环境下更好
 */
public class RandomUtils {




    public static void nextInt(){
        ThreadLocalRandom.current().nextInt();
    }



}
