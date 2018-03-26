package design.patten.bridge;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:30.
 * © All Rights Reserved.
 *
 * Oracle桥
 */
public class OracleBridgeImpl implements Bridge<Object> {

    @Override
    public void insert(Object o) {
        System.out.println("Oracle : insert");
    }

    @Override
    public void delete(Object o) {
        System.out.println("Oracle : delete");
    }

    @Override
    public void update(Object o) {
        System.out.println("Oracle : update");
    }

    @Override
    public void select(Object o) {
        System.out.println("Oracle : select");
    }
}
