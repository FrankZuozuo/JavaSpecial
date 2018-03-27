package lombok;

import java.io.*;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 14:23.
 * © All Rights Reserved.
 */

// 相当于 @Getter/@Setter/@ToString/@EqualsAndHashCode/@RequiredArgsConstructor 的组合体
@Data

// 生成无参数构造方法
@NoArgsConstructor

// 生成全部参数的构造方法
@AllArgsConstructor


public class AboutBean {

    private String name, describe;
    private Integer age;

    private boolean sex;


    // 生成一个静态的获取实例的方法
    @RequiredArgsConstructor(staticName = "of")

    // 生成全部字段的getter方法
    @Getter

    // 生成全部字段的etter方法,指定该方法的权限
    @Setter(AccessLevel.PUBLIC)

    // 生成tostring方法
    @ToString

    // 生成EqualsAndHashCode方法
    @EqualsAndHashCode
    private static class InnerClass {


        public static void main(String[] args) {
            InnerClass innerClass = of();
        }
    }


    // 通过builder方式构建实例
    @Builder
    private static class OtherClass {

        private String foo, bar;

        public static void main(String[] args) {

            OtherClass.builder().foo("foo").bar("bar").build();
        }
    }


    public void ok(@NonNull String str) {

        // @NonNull 相当于
        if (str == null) throw new NullPointerException("NPE");
    }


    // @SneakyThrows 相当于吧这个代码块用try catch包起来,抛出指定异常
    @SneakyThrows(IOException.class)
    public static void main(String[] args) {

        // @Cleanup 自动进行资源回收，但是该注解在代码抛出异常的时候导致原始异常消失，抛出Cleanup自身的异常,不建议使用
        // JDK7可以使用另外一种方式
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

        // JDK7
        try (InputStream in1 = new FileInputStream(args[0]);OutputStream out1 = new FileOutputStream(args[1]);){
            byte[] b1 = new byte[10000];
            while (true) {
                int r = in1.read(b);
                if (r == -1) break;
                out1.write(b, 0, r);
            }
        }
    }
}
