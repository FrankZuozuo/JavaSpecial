package design.callback;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 16:52.
 * © All Rights Reserved.
 */
public interface CallBack<B,A,F,P> extends Notice<P> {


    // 前置
    default void before(B before) {
    }

    // 环绕
    default void around(A around) {
    }

    // 后置
    default void after(F after) {
    }

    // 环绕增强
    default void call(B before, A around, F after,P parameter) {
        before(before);
        around(around);
        callback(parameter);
        around(around);
        after(after);
    }

    // 执行通知
    default void call(P parameter) {
        callback(parameter);
    }
}
