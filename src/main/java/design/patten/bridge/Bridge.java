package design.patten.bridge;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:25.
 * © All Rights Reserved.
 *
 *
 * 指定桥接通信方式
 */
public interface Bridge<T> {

    void insert(T t);

    void delete(T t);

    void update(T t);

    void select(T t);
}
