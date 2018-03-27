package utils.complex;

import utils.print.Print;

import java.util.UUID;

/**
 * @author Created by 谭健 on 2018/3/27 0027. 星期二. 14:39.
 * © All Rights Reserved.
 */
public class UUIDUtils {


    public static void main(String[] args) {
        Print.echo(randomUUID().length());

        Print.echo(uuidVersion());

        Print.echo(randomUUIDWithoutRod());
    }


    /**
     * @return 一个随机的UUID
     */
    public static String randomUUID() {
        return String.valueOf(UUID.randomUUID());
    }

    /**
     * UUID 一共5个版本，Java中的一般是第四个版本
     *
     * @return 获取UUID的版本号
     */
    public static int uuidVersion() {
        return randomUUID().charAt(14) - 48;
    }


    /**
     *
     * @return 一个随机的没有横杠的UUID
     */
    public static String randomUUIDWithoutRod() {
        return randomUUID().replaceAll("-", "");
    }


}
