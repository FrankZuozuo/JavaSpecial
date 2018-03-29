package java8;


import static java.lang.System.out;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 12:51.
 * © All Rights Reserved.
 */
public class ImplInterface {


    public static void main(String[] args) {


        test();
    }


    /**
     * 使用lambda实现接口
     */
    private static void test() {


        dogImplRun(() -> out.println("Dog Run"));

    }


    private static void dogImplRun(Run run) {
        run.start();
    }

    private interface Run {

        void start();
    }


}
