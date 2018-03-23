package utils.http;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 13:53.
 * © All Rights Reserved.
 */
public class IPUtils {




    /**
     * 获取一个请求的发起IP
     *
     * @param request HttpServletRequest
     * @return String类型的ip
     */
    public static String getRemoteIp(HttpServletRequest request) {
        String ip;
        ip = request.getHeader("x-forwarded-for");
        if (isNullIp(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (isNullIp(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (isNullIp(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (isNullIp(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (isNullIp(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.contains(",")) {
            ip = ip.split(",")[0];
        }
        if ("0.0.0.0.0.0.0.1".equals(ip) || "0.0.0.0.0.0.0.1%0".equals(ip)) {
            ip = "127.0.0.1";
        }
        return ip;
    }

    /**
     * IP空验证
     *
     */
    private static boolean isNullIp(final String ip) {
        return ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip);
    }


}
