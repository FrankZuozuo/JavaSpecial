package string;

/**
 * Created by 谭健 on 2018/3/21 0021. 17:27.
 * © All Rights Reserved.
 */
public class Test {


    public static void main(String[] args) {


        boolean bool = false;

        String str = "on";

        System.out.println(


                StringConn.of(
                        "Hello ",
                        "World",
                        (StringLogicConn) () ->   bool ? "!":".",

                        (StringLogicConn) () -> {
                           String text = "off";
                           if (text.equals(str)) return "on";
                           return "off";
                        }

                )
        );


    }
}
