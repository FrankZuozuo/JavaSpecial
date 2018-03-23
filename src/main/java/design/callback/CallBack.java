package design.callback;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 16:52.
 * © All Rights Reserved.
 */
public interface CallBack extends Notice {


    // 前置
    default void before(String before) {
    }

    // 环绕
    default void around(String around) {
    }

    // 后置
    default void after(String after) {
    }

    // 环绕增强
    default void call(String before, String around, String after) {
        before(before);
        around(around);
        callback();
        around(around);
        after(after);
    }

    // 执行通知
    default void call() {
        callback();
    }
}
