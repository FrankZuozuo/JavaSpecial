package design.patten.template;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 15:18.
 * © All Rights Reserved.
 */
public class RealChild extends AbstractParent{

    @Override
    public int birthToChild(boolean isDie, int number) {
        System.out.println("调用了抽象类子类的 birthToChild() 方法。");
        return isDie ? 0 : number;
    }

    public static void main(String[] args) {


        test();
    }



    private static void test(){
        AbstractParent parent = new RealChild();
        parent.birthToChild(2);
    }
}
