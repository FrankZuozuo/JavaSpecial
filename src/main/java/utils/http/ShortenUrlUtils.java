package utils.http;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 15:35.
 * © All Rights Reserved.
 */
public class ShortenUrlUtils {


    @Data
    @Accessors(chain = true)
    public static class Result {
        private String request, error, url_short, url_long;
        private Integer error_code, type;
        private boolean result;

    }


    private static final String
            URL = "http://api.t.sina.com.cn/short_url/shorten.json",
            APP_KEY = "";


    public static Result shortUrl(String url){

        // TODO
        return new Result();
    }


}
