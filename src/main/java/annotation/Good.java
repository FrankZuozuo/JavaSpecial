package annotation;

import java.lang.annotation.*;

/**
 * @author Created by 谭健 on 2018/4/9 0009. 星期一. 13:09.
 * © All Rights Reserved.
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(
        {
                ElementType.FIELD,
                ElementType.METHOD
        }
)
@Documented
public @interface Good {


    String name() default "Good";

}
