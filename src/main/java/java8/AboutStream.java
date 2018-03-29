package java8;

import utils.print.Print;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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


        // 过滤
        list.stream().filter(AboutStream::isNotNull).forEach(Print::echo);
        list.stream().filter(AboutStream::isNull).forEach(Print::echo);

        // 连续过滤
        list.stream().filter(AboutStream::isNotNull).filter(s -> s.equals("2")).forEach(Print::echo);

        list.stream().filter(AboutStream::isNotNull).max(String::compareTo).filter(AboutStream::isPresent).ifPresent(Print::echo);


    }


    private static boolean isNotNull(String s) {
        return s != null;
    }

    private static boolean isNull(String s) {
        return s == null;
    }

    private static boolean isPresent(String s) {
        Optional<String> so =Optional.of(s);
        return so.isPresent();
    }


}
