package lombok;

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

// 生成一个静态的获取实例的方法
// @RequiredArgsConstructor(staticName = "of")
public class AboutBean {

    private String name, describe;
    private Integer age;

    private boolean sex;


    // 生成全部字段的getter方法
    @Getter

    // 生成全部字段的etter方法,指定该方法的权限
    @Setter(AccessLevel.PUBLIC)

    // 生成tostring方法
    @ToString

    // 生成EqualsAndHashCode方法
    @EqualsAndHashCode
    public class InnerClass {


    }


    public void ok(@NonNull String str) {

        // @NonNull 相当于
        if (str == null) throw new NullPointerException("NPE");
    }

    @SneakyThrows(Exception.class)
    public void throwException(){

        // @SneakyThrows 相当于吧这个代码块用try catch包起来,抛出指定异常
    }

    public static void main(String[] args) {

    }
}
