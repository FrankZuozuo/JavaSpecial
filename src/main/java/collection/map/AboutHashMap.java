package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 14:07.
 * © All Rights Reserved.
 */
public class AboutHashMap {


    public static void main(String[] args) {

        test();
    }


    private static void test() {

        // news
        Map<String, Object> map = new HashMap<String, Object>(10) {
            {

                put("name", "Frank");
                put("age", 26);
                put("sex", false);
                put("describe", "A boy");
            }
        };


        System.out.println(map.getOrDefault("describe-of", "No key"));


    }
}
