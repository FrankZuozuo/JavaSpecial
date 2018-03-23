package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 10:07.
 * © All Rights Reserved.
 */
public class OrderSortList {


    public static void main(String[] args) {


        list();
    }


    private static void list() {

        System.out.println("list 有序");

        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
            }
        };


        list.forEach(
                System.out::println
        );


        list.forEach(
                System.out::println
        );


        list.forEach(
                out::println
        );


        System.out.println(list);
        System.out.println(list);

        out.println(list);

    }
}
