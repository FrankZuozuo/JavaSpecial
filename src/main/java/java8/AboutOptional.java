package java8;

import com.google.common.collect.Lists;
import com.sun.org.apache.regexp.internal.RE;
import utils.print.Print;

import java.util.List;
import java.util.Optional;


/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 9:59.
 * © All Rights Reserved.
 */
public class AboutOptional {


    public static void main(String[] args) {
        test();
    }

    private static void test() {


        String foo = "foo", foobar, fb;

        List<String> list = Lists.newArrayList("f", "o", "o", null, "b", "a", "r");

        Optional<String> optional = Optional.of(foo);
        Optional<List<String>> optionalStringList = Optional.of(list);

        // 如果存在值，则打印
        optional.ifPresent(Print::echo);


        // 进行安全的操作
        foobar = optionalStringList
                // 过滤器
                .filter(s -> s.size() > 5)
                .map(s -> s.get(3))
                .map(String::toUpperCase)
                .orElse(null);
        Print.echo(foobar);

        // 等价于
        if (list != null) {
            if (list.size() > 5) {
                String s = list.get(3);
                if (s != null) {
                    fb = s.toUpperCase();
                } else {
                    fb = null;
                }
            } else {
                fb = null;
            }
        } else {
            fb = null;
        }
        Print.echo(fb);


        // 进行安全的操作 - 使用函数
        foobar = optionalStringList
                .filter(s -> s.size() > 5)
                .map(s -> s.get(3))
                .map(String::toUpperCase)
                // 使用函数
                .orElseGet(AboutOptional::getDefaultFromDB);
        Print.echo(foobar);


        Print.echo("optional 是否有值 ： " + optional.isPresent());

        // 如果值存在， 则调用指定的Consumer 方法
        optional.ifPresent(Print::echo);


        // 创建一个可能为null的Optional
        Optional empty = Optional.ofNullable(null);
        // 返回Optional.empty
        Print.echo(empty);

        // 获取Optional 的值
        Print.echo(optional.get());


        String s = optionalStringList.map(strings -> strings.get(6)).orElseThrow(IndexOutOfBoundsException::new);

        Print.echo(s);


        // flatMap : 与map相当，不同的是需要通过Optional来构建值
        String b = optionalStringList
                .filter(lists -> lists.size() > 6)
                .flatMap(a -> Optional.of(a.get(0)))
                .orElse(null);

        Print.echo(b);
    }


    private static String getDefaultFromDB(){

        // do get
        return "Default";
    }
}
