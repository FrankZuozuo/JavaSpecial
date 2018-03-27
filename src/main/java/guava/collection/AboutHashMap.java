package guava.collection;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import utils.print.Print;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Created by 谭健 on 2018/3/27 0027. 星期二. 16:34.
 * © All Rights Reserved.
 */
public class AboutHashMap {


    public static void main(String[] args) {
        test();
        immutable();
    }


    /**
     * 以下的使用形式都会通过指定合理的capacity大小来优化内存
     */
    private static void test(){


        Map map = Maps.newHashMapWithExpectedSize(3);

        Map<String,Object> treeMap = new TreeMap<String,Object>(){
            {
                put("foo",1);
                put("bar",2);
            }
        };

        // 把其它的map转成hashmap
        Map hashMap = Maps.newHashMap(treeMap);

        Print.echo(hashMap);
    }

    private static void immutable(){

        // 快速构建map
        Map<String,Object> of = ImmutableMap.of("foo",1,"bar",2);

        Print.echo(of);
    }
}
