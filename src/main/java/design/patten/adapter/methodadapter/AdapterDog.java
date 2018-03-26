package design.patten.adapter.methodadapter;

import lombok.AllArgsConstructor;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:37.
 * © All Rights Reserved.
 *
 * 创建适配器
 *  1- 残废狗使用了适配器（安装假肢）
 *  2- 残废狗实现了狗类接口
 *
 */

@AllArgsConstructor
public class AdapterDog implements Dog {


    // 残废狗来看医生
    private CrippleDog crippleDog;


    // 狗自己实现吃
    @Override
    public void eat() {
        crippleDog.eat();
    }


    // 狗医生通过适配器给狗装了狗腿子
    @Override
    public void run() {

        System.out.println("dog run");
    }
}
