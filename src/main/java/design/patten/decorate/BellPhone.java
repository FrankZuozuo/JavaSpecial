package design.patten.decorate;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 11:43.
 * © All Rights Reserved.
 *
 * 装饰器：铃声
 * 手机打电话没有接通之前要加个铃声装饰一下
 * 这个是装饰打电话的，所以装饰器实现电话接口
 *
 * 响铃手机
 */
public class BellPhone implements Phone {


    private GarbagePhone garbagePhone;


    public BellPhone(){
        garbagePhone = new GarbagePhone();
    }

    @Override
    public void call() {

        decorate();
        if (handle(ASK)) garbagePhone.call();
    }

    @Override
    public boolean handle(boolean handleWith) {
        return handleWith;
    }

    private void decorate() {
        System.out.println("di di di.");
    }
}
