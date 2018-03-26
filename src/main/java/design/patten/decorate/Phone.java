package design.patten.decorate;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 11:41.
 * © All Rights Reserved.
 *
 * 打电话接口，具备打电话的功能
 */
public interface Phone {

    boolean ASK = true;
    boolean CANCEL = false;

    void call();

    default boolean handle(boolean handleWith) {
        return true;
    }
}
