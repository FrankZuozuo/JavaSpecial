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

    public static String nowDate() {
        return LocalDate.now().toString();
    }

    public static String nowTime() {
        return DateTimeFormatter.ofPattern(DateTimePattern.HH_MM_SS).format(LocalTime.now());
    }

    public static String nowYear() {
        return String.valueOf(LocalDate.now().getYear());
    }

    public static String nowMonth() {
        return String.valueOf(LocalDate.now().getMonthValue());
    }

    public static String nowDay() {
        return String.valueOf(LocalDate.now().getDayOfMonth());
    }

    public static String of(String pattern) {
        return DateTimeFormatter.ofPattern(pattern).format(LocalDateTime.now());
    }

}
