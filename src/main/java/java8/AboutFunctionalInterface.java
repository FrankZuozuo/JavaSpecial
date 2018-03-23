package java8;


import java.lang.FunctionalInterface;

import static java.lang.System.out;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 12:58.
 * © All Rights Reserved.
 */
public class AboutFunctionalInterface {


    public static void main(String[] args) {


        test();
    }


    private static void test() {


        // 定义运算执行逻辑
        Add add = (x, y) -> x + y;

        int r = add.r(17, 8);

        out.println(r);
    }


    @FunctionalInterface
    private interface Add {

        int r(int x, int y);
    }


}
