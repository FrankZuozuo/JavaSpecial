package design.patten.proxy;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:23.
 * © All Rights Reserved.
 *
 * 你并不是特别的熟悉以前连接电源的方式
 * 但是你知道如何处理新的连接
 * <p>
 * 你并不想重新背起以前的锅
 * 所以你创建一个代理来完成你的工作
 * 既不会改变原来的逻辑，也能够完成你的工作
 */
public class NewPower implements Power {


    private OldPower oldPower;


    public NewPower(){
        super();
        oldPower = new OldPower();
    }

    @Override
    public void run() {
        before();
        around();
        oldPower.run();
        around();
        after();
        System.out.println("power : running");
    }


    private void before(){
        // 创建 新接口 对入口开放
    }

    private void after(){
        // 创建 新接口 对出口开放
    }

    private void around(){
        // 兼容 老接口 对老设备开放
    }
}
