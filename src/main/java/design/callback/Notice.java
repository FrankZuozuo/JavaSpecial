package design.callback;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 17:25.
 * © All Rights Reserved.
 */
public interface Notice<P> {

    void callback(P parameter);
}
