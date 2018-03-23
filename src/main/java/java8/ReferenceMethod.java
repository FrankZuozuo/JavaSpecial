package java8;


import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 12:45.
 * © All Rights Reserved.
 */
public class ReferenceMethod {


    public static void main(String[] args) {

        test();

    }


    private static void test() {

        List<String> list = new ArrayList<String>() {
            {
                add("China");
                add("US");
                add("Japan");
            }
        };


        list.forEach(
                out::println
        );


    }


}
