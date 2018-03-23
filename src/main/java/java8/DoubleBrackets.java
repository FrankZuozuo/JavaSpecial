package java8;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

/**
 * Created by 谭健 on 2018/3/21 0021. 14:55.
 * © All Rights Reserved.
 */
public class DoubleBrackets {


    public static void main(String[] args) {


        Map map = new HashMap() {
            {
                put("user", "Frank");
                put("sex","true");
            }
        };

        out.println(JSON.toJSONString(map));


        Faker faker = new Faker(){
            {
                setAge(20).setName("Faker").setDescribe("LOL");
            }
        };

        out.println(JSON.toJSONString(faker));

        out.println(currentTimeMillis());
    }



    @Data
    @Accessors(chain = true)
    private static class Faker{

        private String name,describe;
        private int age;

    }
}
