package guava.collection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import utils.print.Print;

import java.util.List;
import java.util.Map;

/**
 * @author Created by 谭健 on 2018/3/27 0027. 星期二. 16:15.
 * © All Rights Reserved.
 */
public class AboutList {


    public static void main(String[] args) {
        test();
        immutable();
    }


    /**
     * 以下的使用形式都会通过指定合理的capacity大小来优化内存
     */
    private static void test(){
        // 指定初始容量
        List arrayList = Lists.newArrayListWithCapacity(15);

        // 初始化一个有值的list
        List<String> ofList = Lists.newArrayList("foo","bar");


        Map<String,Object> map = Maps.newHashMapWithExpectedSize(3);
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        // 把实现了迭代器接口的对象转为list
        List list = Lists.newArrayList(map.keySet().iterator());

        // 初始化一个预期大小的list
        List expectList = Lists.newArrayListWithExpectedSize(10);

        Print.echo(list);
    }

    private static void immutable(){

        // 快速构建list
        List<String> of = ImmutableList.of("foo","bar");

        Print.echo(of);
    }
}
