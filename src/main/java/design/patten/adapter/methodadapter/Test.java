package design.patten.adapter.methodadapter;



/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:41.
 * © All Rights Reserved.
 */

public class Test {



    public static void main(String[] args) {
        test();
    }

    public static void test() {


        Dog crippleDog = new CrippleDog();
        crippleDog.run();
        crippleDog.eat();

        System.out.println(" - - - - - - - - ");

        Dog dog = new AdapterDog(new CrippleDog());
        dog.eat();
        dog.run();
    }
}
