package design.patten.proxy;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:20.
 * © All Rights Reserved.
 *
 * 前辈编写了一个复杂的流程来实现连接电源
 * 他能够正常运行
 * 但是新的设备需要新的匹配
 */
public class OldPower implements Power{
    @Override
    public void run() {

        // run is dark
        // 并不清楚里面的逻辑
    }
}
