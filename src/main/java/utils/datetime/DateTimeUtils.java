package utils.datetime;

import consts.DateTimePattern;
import string.stringconn.StringConn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 16:36.
 * © All Rights Reserved.
 */
public class DateTimeUtils {


    public static void main(String[] args) {


        System.out.println(
                StringConn.of(

                        nowDate(),
                        "\n",
                        nowTime(),
                        "\n",
                        of(DateTimePattern.YYYY_MM_DD_HH_MM_SS),
                        "\n",
                        nowDay(),
                        "\n",
                        nowYear(),
                        "\n",
                        nowMonth()
                )
        );

    }



    /**
     * 获取当前日期
     */
    public static String nowDate() {
        return LocalDate.now().toString();
    }

    /**
     * 获取当前时间
     */
    public static String nowTime() {
        return DateTimeFormatter.ofPattern(DateTimePattern.HH_MM_SS).format(LocalTime.now());
    }

    /**
     * 获取当前年份
     */
    public static String nowYear() {
        return String.valueOf(LocalDate.now().getYear());
    }

    /**
     * 获取当前月份
     */
    public static String nowMonth() {
        return String.valueOf(LocalDate.now().getMonthValue());
    }

    /**
     * 获取当前日
     */
    public static String nowDay() {
        return String.valueOf(LocalDate.now().getDayOfMonth());
    }

    /**
     * 获取指定格式的当前日期
     */
    public static String of(String pattern) {
        return DateTimeFormatter.ofPattern(pattern).format(LocalDateTime.now());
    }

}
