package design.patten.bridge;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:28.
 * © All Rights Reserved.
 *
 * DB2 桥
 */
public class DB2BridgeImpl implements Bridge<Object>{

    @Override
    public void insert(Object o) {
        System.out.println("DB2 : insert");
    }

    @Override
    public void delete(Object o) {
        System.out.println("DB2 : delete");
    }

    @Override
    public void update(Object o) {
        System.out.println("DB2 : update");
    }

    @Override
    public void select(Object o) {
        System.out.println("DB2 : select");
    }
}
