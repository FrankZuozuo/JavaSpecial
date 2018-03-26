package design.patten.adapter.classadapter;

import design.patten.adapter.methodadapter.CrippleDog;
import design.patten.adapter.methodadapter.Dog;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:46.
 * © All Rights Reserved.
 */
public class AdapterDog extends CrippleDog implements Dog{



    // 给残废购装个狗腿子
    @Override
    public void run() {
        System.out.println("dog run");
    }

    // 残废狗本身就能吃，所以残废狗不需要实现狗接口的吃方法
}
