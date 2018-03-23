package string.stringconn;

/**
 * Created by 谭健 on 2018/3/21 0021. 17:27.
 * © All Rights Reserved.
 */
public class Test {


    public static void main(String[] args) {

        test();

    }


    private static void test() {


        boolean bool = false;

        String str = "on";

        System.out.println(


                StringConn.of(
                        "Hello ",
                        "World",
                        (StringLogicConn) () -> bool ? "!" : ".",

                        (StringLogicConn) () -> {
                            String text = "off";
                            if (text.equals(str)) return "on";
                            return "off";
                        }

                )
        );



    }
}
