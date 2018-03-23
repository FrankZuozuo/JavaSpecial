package design.callback;


/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 17:07.
 * © All Rights Reserved.
 */
public class Test {


    public static void main(String[] args) {
        test();


    }


    private static void test() {


        Boss boss = new Boss(new StaffImpl());

        boss.pushRequest();
    }
}
