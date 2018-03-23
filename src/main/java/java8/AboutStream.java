package java8;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 13:07.
 * © All Rights Reserved.
 */
public class AboutStream {


    public static void main(String[] args) {

        test();
    }


    private static void test() {


        List<String> list = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add(null);
                add("6");
            }
        };

        list.stream().filter(AboutStream::isNotNull).forEach(out::println);
        list.stream().filter(AboutStream::isNull).forEach(out::println);


    }


    private static boolean isNotNull(String s){
        return s != null;
    }

    private static boolean isNull(String s){
        return s == null;
    }

}
