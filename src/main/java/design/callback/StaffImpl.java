package design.callback;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 16:55.
 * © All Rights Reserved.
 */
public class StaffImpl implements Staff{


    @Override
    public void report() {
        System.out.println("小明主体：小明收到消息");
    }

    @Override
    public void pourTea(CallBack<String, String, String, String> sign){

        // 倒茶

        // 拿老板的签名跟老板通信
        sign.call("好的收到","移动位置","好的，已经完成","");
    }






}
