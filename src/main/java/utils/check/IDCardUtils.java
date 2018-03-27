package utils.check;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 13:47.
 * © All Rights Reserved.
 */
public class IDCardUtils {


    public static void main(String[] args) {

        // 号码来源于网络
        boolean legalIDCard = IDCardUtils.isLegalIDCard("350301198906180060");

        System.out.println(legalIDCard);
    }


    /*
     * Weighting factor 加权因子
     */
    private static final int[] WEIGHTING_FACTOR = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    /*
     * Check code 校验码
     */
    private static final char[] CHECK_CODE = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

    /*
     * Match Date String
     */
    private static final String MATCH_DATE = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?" +
            "((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1" +
            "-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2]" +
            "[0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))" +
            "(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$";

    /**
     * 检查一个身份证号码是否合法
     *
     * @param idCard 身份证号码
     * @return 是合法身份证号码返回true 否则返回false
     */
    public static boolean isLegalIDCard(String idCard) {
        idCard = idCard.toUpperCase();
        if ("^\\d{15}$".matches(idCard)) {
            idCard = convertCard15ToCard18(idCard);
        }
        return idCard.matches("^\\d{17}[xX]|\\d{18}$") && isLegalDate(idCard) && isLegalCheckCode(idCard);
    }


    /**
     * 检查一个身份证号码的校验码是否合法
     *
     * @param idCard 身份证号码
     * @return 是合法校验码返回true 否则返回false
     */
    private static boolean isLegalCheckCode(String idCard) {
        return idCard.toCharArray()[17] == getCheckCode(idCard);
    }

    /**
     * 检查一个身份证号码的日期是否合法
     *
     * @param idCard 身份证号码
     * @return 是合法日期返回true 否则返回false
     */
    private static boolean isLegalDate(String idCard) {
        String year = idCard.substring(6, 10);
        String month = idCard.substring(10, 12);
        String day = idCard.substring(12, 14);
        String date = year + "-" + month + "-" + day;
        return date.matches(MATCH_DATE);
    }


    /**
     * 把一个15位的身份证号码转换成18位身份证号码
     *
     * @param card15 15位身份证号码
     * @return 18位身份证号码
     */
    private static String convertCard15ToCard18(String card15) {
        if (card15.length() != 15) {
            return "";
        }

        StringBuffer card18;
        card18 = new StringBuffer(25);
        // 地区编码
        card18.append(card15.substring(0, 6))
                // 年代
                .append(19)
                // 生日
                .append(card15.substring(6, 15))
                // 校验码
                .append(getCheckCode(card18.toString()));
        return card18.toString();

    }


    /**
     * 获取一个身份证号码的校验码
     *
     * @param idCard 身份证号码
     * @return 身份证号码的校验码
     */
    private static char getCheckCode(String idCard) {
        int checkCodeIndex = 0;
        for (int i = 0; i < 17; i++) {
            // '0' == 48
            checkCodeIndex += (idCard.charAt(i) - 48) * WEIGHTING_FACTOR[i];
        }
        checkCodeIndex %= CHECK_CODE.length;
        return CHECK_CODE[checkCodeIndex];
    }

}
