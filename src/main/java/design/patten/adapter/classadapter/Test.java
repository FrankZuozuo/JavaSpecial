package design.patten.adapter.classadapter;

import design.patten.adapter.methodadapter.Dog;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:48.
 * © All Rights Reserved.
 */
public class Test {


    public static void main(String[] args) {
        test();
    }

    public static void test() {

        Dog dog = new AdapterDog();

        dog.eat();
        dog.run();
    }
}
