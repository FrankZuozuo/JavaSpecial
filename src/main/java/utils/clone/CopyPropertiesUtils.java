package utils.clone;

import org.springframework.beans.BeansException;


import static org.springframework.beans.BeanUtils.*;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 14:43.
 * © All Rights Reserved.
 */
public class CopyPropertiesUtils {


    // 浅拷贝

    public static void copy(Object source, Object target) throws BeansException {
        copyProperties(source, target);
    }

    public static void copy(Object source, Object target, Class<?> editable) throws BeansException {
        copyProperties(source, target, editable);
    }

    public static void copy(Object source, Object target, String... ignoreProperties) throws BeansException {
        copyProperties(source, target, ignoreProperties);
    }


}
