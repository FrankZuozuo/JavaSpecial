package design.callback;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 16:53.
 * © All Rights Reserved.
 */

@NoArgsConstructor
public class Boss implements CallBack {

    private Staff staff;


    public Boss(Staff staff) {
        // 老板有需求
        System.out.println("老板主体：我有个需求");

        this.staff = staff;

        // 指定某个员工后，员工出示自己的签名
        staff.report();
    }

    public void pushRequest() {

        System.out.println("小明，去，给老子倒水。");

        // 老板发送倒水指令，并提供了自己的签名
        staff.pourTea(this);
    }


    @Override
    public void before(String before) {
        System.out.println("before : " + before);
    }

    @Override
    public void around(String around) {
        System.out.println("around : " + around);
    }

    @Override
    public void after(String after) {
        System.out.println("after :" + after);
    }

    @Override
    public void callback() {

        System.out.println("ok");
    }
}
