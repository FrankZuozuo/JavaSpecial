package design.patten.proxy;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:28.
 * © All Rights Reserved.
 */
public class Test {

    public static void main(String[] args) {
        test();
    }


    private static void test() {

        Power power = new NewPower();
        power.run();
    }
}
