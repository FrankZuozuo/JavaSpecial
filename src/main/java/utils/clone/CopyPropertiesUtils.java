package utils.clone;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.BeansException;


import static org.springframework.beans.BeanUtils.*;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 14:43.
 * © All Rights Reserved.
 */
public class CopyPropertiesUtils {



    @Data
    @Accessors(chain = true)
    private static class User{
        private String name;
        private Integer age;
        private boolean sex;

    }

    public static void main(String[] args) {


        test();

    }

    private static void test(){

        User user = new User(){
            {
                setName("Frank").setAge(26).setSex(false);
            }
        };

        User user1 = new User(){
            {
                setName("zuozuo").setAge(27).setSex(true);
            }
        };

        // user1 to user
        user1.setSex(user.isSex())
                .setAge(user.getAge())
                .setName(user.getName());

        System.out.println(user1.toString());


        // do copo way
        CopyPropertiesUtils.copy(user,user1);
        System.out.println(user1.toString());
    }

















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
