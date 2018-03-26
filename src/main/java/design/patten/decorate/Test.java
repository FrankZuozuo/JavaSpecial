package design.patten.decorate;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 11:53.
 * © All Rights Reserved.
 */
public class Test {

    public static void main(String[] args) {

        test();

    }


    private static void test(){
        Phone garbagePhone = new GarbagePhone();
        Phone bellPhone = new BellPhone();
        garbagePhone.call();
        bellPhone.call();
    }
}
