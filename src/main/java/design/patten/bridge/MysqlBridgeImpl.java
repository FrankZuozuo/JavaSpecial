package design.patten.bridge;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:29.
 * © All Rights Reserved.
 *
 * Mysql桥
 */
public class MysqlBridgeImpl implements Bridge<Object> {
    @Override
    public void insert(Object o) {
        System.out.println("Mysql : insert");
    }

    @Override
    public void delete(Object o) {
        System.out.println("Mysql : delete");
    }

    @Override
    public void update(Object o) {
        System.out.println("Mysql : update");
    }

    @Override
    public void select(Object o) {
        System.out.println("Mysql : select");
    }
}
