package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 谭健 on 2018/3/21 0021. 13:27.
 * © All Rights Reserved.
 */
public class AboutFastJson {


    public static void main(String[] args) {


        System.out.println(JSON.toJSONString(Meta.SUCCESS));


        Map map = new HashMap(16);



        User user = new User("Frank","http://www.baidu.com/",false);

        map.put("user",user);
        map.put("meta",Meta.SUCCESS);

        System.out.println(JSON.toJSONString(map));


    }



    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User{


        private String name,url;
        private boolean sex;

    }


    public enum Meta{
        SUCCESS(200,"success"),
        FAIL(500,"fail");

        private int code;
        private String message;

        Meta(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }

}
