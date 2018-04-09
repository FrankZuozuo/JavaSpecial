package utils.check;

import java.util.regex.Pattern;

/**
 * @author Created by 谭健 on 2018/4/9 0009. 星期一. 10:02.
 * © All Rights Reserved.
 * <p>
 * 基础校验类
 */
public class PatternKitUtils {


    /**
     * @param email 邮件地址
     * @return 是email地址返回true
     */
    public static boolean isEmail(String email) {
        return Pattern.matches("\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?", email);
    }

    /**
     * @param IDCard 身份证号码
     * @return 是合法的身份证返回true
     */
    public static boolean isIDCrad(String IDCard) {
        return IDCardUtils.isLegalIDCard(IDCard);
    }


    /**
     * 支持国际格式 +86 等
     * <p>
     * 移动、联通、电信运营商的号码段
     * <p>移动的号段：134(0-8)、135、136、137、138、139、147（预计用于TD上网卡）
     * 、150、151、152、157（TD专用）、158、159、187（未启用）、188（TD专用）</p>
     * <p>联通的号段：130、131、132、155、156（世界风专用）、185（未启用）、186（3g）</p>
     * <p>电信的号段：133、153、180（未启用）、189</p>
     *
     * @param mobile 手机号码
     * @return 是手机号码返回true
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches("(\\+\\d+)?1[34578]\\d{9}$", mobile);
    }


    /**
     * 电话号码，格式：国家（地区）电话代码 + 区号（城市代码） + 电话号码，如：+8602085588447
     * <p><b>国家（地区） 代码 ：</b>标识电话号码的国家（地区）的标准国家（地区）代码。它包含从 0 到 9 的一位或多位数字，
     * 数字之后是空格分隔的国家（地区）代码。</p>
     * <p><b>区号（城市代码）：</b>这可能包含一个或多个从 0 到 9 的数字，地区或城市代码放在圆括号——
     * 对不使用地区或城市代码的国家（地区），则省略该组件。</p>
     * <p><b>电话号码：</b>这包含从 0 到 9 的一个或多个数字 </p>
     *
     * @param phone 电话号码
     * @return 是固定电话号码返回true
     */
    public static boolean isPhone(String phone) {
        return Pattern.matches("", phone);
    }


    /**
     * 包括负数
     *
     * @param digit 整数字符串
     * @return 是整数返回true
     */
    public static boolean isDigit(String digit) {
        return Pattern.matches("\\-?[1-9]\\d+", digit);
    }


    /**
     * 验证整数和浮点数（正负整数和正负浮点数）
     *
     * @param decimals 一位或多位0-9之间的浮点数，如：1.23，233.30
     * @return 是整数和浮点数返回true
     */
    public static boolean isDecimals(String decimals) {
        return Pattern.matches("\\-?[1-9]\\d+(\\.\\d+)?", decimals);
    }


    /**
     * 验证空白字符
     *
     * @param blankSpace 空白字符，包括：空格、\t、\n、\r、\f、\x0B
     * @return 是空白字符返回true
     */
    public static boolean isBlankSpace(String blankSpace) {
        return Pattern.matches("\\s+", blankSpace);
    }


    /**
     * 验证中文
     *
     * @param chinese 中文字符
     * @return 是中文返回true
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches("^[\u4E00-\u9FA5]+$", chinese);
    }

    /**
     * 验证中文字母数字空格
     *
     * @param chinese 中文字符
     * @return 验证成功返回true，验证失败返回false
     */
    public static boolean isRealName(String chinese) {
        return Pattern.matches("^[A-Za-z0-9\\s\u4E00-\u9FA5]+$", chinese);
    }

    /**
     * 检测是否是数字
     *
     * @param str 数字字符串
     * @return 是数字字符串返回true
     */
    public static boolean isNumber(String str) {
        return Pattern.matches("^[1-9]\\d*$", str);
    }


    /**
     * 验证日期（年月日）
     *
     * @param birthday 日期，格式：1992-09-03，或1992.09.03
     * @return 验证成功返回true，验证失败返回false
     */
    public static boolean isBirthday(String birthday) {
        return Pattern.matches("^(\\d{4})-(\\d{2})-(\\d{2})$", birthday);
    }

    /**
     * 验证URL地址
     *
     * @param url 网络地址
     * @return 验证成功返回true，验证失败返回false
     */
    public static boolean isURL(String url) {
        return Pattern.matches("(https?://(w{3}\\.)?)?\\w+\\.\\w+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/\\w*)*(\\??(.+=.*)?(&.+=.*)?)?", url);
    }

    /**
     * 匹配中国邮政编码
     *
     * @param postcode 邮政编码
     * @return 验证成功返回true，验证失败返回false
     */
    public static boolean isPostcode(String postcode) {
        return Pattern.matches("[1-9]\\d{5}", postcode);
    }

    /**
     * 匹配IP地址(简单匹配，格式，如：192.168.1.1，127.0.0.1，没有匹配IP段的大小)
     *
     * @param ipAddress IPv4标准地址
     * @return 验证成功返回true，验证失败返回false
     */
    public static boolean isIpAddress(String ipAddress) {
        return Pattern.matches("[1-9](\\d{1,2})?\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))", ipAddress);
    }

    /**
     * 判断是否只有数字,英文,下划线,横线
     *
     * @param string 被验证的字符串
     * @return 是合法的返回true
     */
    public static boolean noSpecialChar(String string) {
        return Pattern.matches("[A-Za-z1-9_-]+$", string);
    }
}
