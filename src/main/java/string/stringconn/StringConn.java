package string.stringconn;

/**
 * Created by 谭健 on 2018/3/21 0021. 17:04.
 * © All Rights Reserved.
 */
public class StringConn {


    private static final int DEFAULT_CAPACITY = 16 * 2 + 2;


    public static String of(Object... objects) {
        return conn(objects);
    }


    private static String conn(Object... objects) {

        StringBuffer buffer = new StringBuffer(DEFAULT_CAPACITY);
        for (Object object : objects) {
            if (object instanceof StringLogicConn) {
                buffer.append(((StringLogicConn) object).logicString());
            } else {
                buffer.append(object);
            }

        }
        return buffer.toString();
    }


}
