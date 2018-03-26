package design.patten.decorate;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 11:42.
 * © All Rights Reserved.
 *
 * 垃圾手机
 */
public class GarbagePhone implements Phone {
    @Override
    public void call() {
        System.out.println("call : into ");
    }


}
