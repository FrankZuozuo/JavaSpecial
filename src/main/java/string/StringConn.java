package string;

/**
 * Created by 谭健 on 2018/3/21 0021. 17:04.
 * © All Rights Reserved.
 */
public class StringConn {


    private static final int DEFAULT_CAPACITY = 16 * 2 + 2;

    public static String of(int capacity, Object... objects) {
        return conn(capacity, objects);
    }


    public static String of(Object... objects) {
        return conn(DEFAULT_CAPACITY, objects);
    }


    private static String conn(int capacity, Object... objects) {

        StringBuffer buffer = new StringBuffer(capacity);
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
