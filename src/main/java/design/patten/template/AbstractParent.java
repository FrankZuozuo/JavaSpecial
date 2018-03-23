package design.patten.template;

import java.util.Random;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 15:17.
 * © All Rights Reserved.
 */
public abstract class AbstractParent {

    // 设计模式 - 模板方法


    public final int birthToChild(int bound) {
        System.out.println("调用了抽象类自己的 birthToChild() 方法。");
        int number = new Random().nextInt(bound);
        return birthToChild(correct(number),number);
    }

    public abstract int birthToChild(boolean isDie,int number);

    public boolean correct(int number) {
        System.out.println("调用了抽象类自己的 correct() 方法。");
        return number == 0;
    }
}
