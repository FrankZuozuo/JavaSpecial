package design.patten.adapter.methodadapter;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:35.
 * © All Rights Reserved.
 */
public class CrippleDog implements Dog{

    @Override
    public void eat() {
        System.out.println("dog eat.");
    }

    @Override
    public void run() {
        // 狗腿子给打断了

    }
}
