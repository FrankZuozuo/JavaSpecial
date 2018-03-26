package design.patten.bridge;

import consts.IDEWarnType;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:36.
 * © All Rights Reserved.
 */


@SuppressWarnings(IDEWarnType.ALL)
public class DAO extends BaseDB {


    // 子类继承并覆写父类的方法后，方法可以拥有比父类更广的域，并且此处应该使用public
    // 使用编辑器自动生成的protected域应该修改
    // 父类使用protected关键字是为了对IDE友好并且控制方法域

    @Override
    public void insert(Object o) {
        super.insert(o);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void update(Object o) {
        super.update(o);
    }

    @Override
    public void select(Object o) {
        super.select(o);
    }

    public void init() {
        // 假设某一天你需要切换到Oracle数据库
        // 那么你只需要返回Oracle的桥资源实例即可
        // 并且你修改之后不需要修改项目中的任何代码
        super.setBridge(new MysqlBridgeImpl());
    }
}
