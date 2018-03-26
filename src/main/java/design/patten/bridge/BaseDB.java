package design.patten.bridge;

import consts.IDEWarnType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:31.
 * © All Rights Reserved.
 */

@Getter
@Setter
@SuppressWarnings(IDEWarnType.ALL)
public abstract class BaseDB<T> {

    // 持有桥资源接口的实例
    // 该抽象类通过资源接口实例来执行操作
    private Bridge bridge;

    protected void insert(T t){
        bridge.insert(t);
    }

    protected void delete(T t){
        bridge.delete(t);
    }

    protected void update(T t){
        bridge.update(t);
    }

    protected void select(T t){
        bridge.select(t);
    }


}
