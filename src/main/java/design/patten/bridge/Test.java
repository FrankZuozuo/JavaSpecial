package design.patten.bridge;

import consts.IDEWarnType;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:40.
 * © All Rights Reserved.
 */
@SuppressWarnings(IDEWarnType.ALL)
public class Test {


    public static void main(String[] args) {
        test();
    }


    public static void test() {

        BaseDB db = new DAO() {
            {
                init();
            }
        };

        db.select("1");
        db.insert("2");
        db.update("3");
        db.delete("4");

    }
}
