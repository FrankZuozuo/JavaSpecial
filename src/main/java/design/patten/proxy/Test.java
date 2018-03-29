package design.patten.proxy;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:28.
 * © All Rights Reserved.
 */
public class Test {


    /**
     *
     * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
     * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
     *
     * 解决：直接访问带来的大开销或者不可直接访问
     * 应用：1.windows的快捷方式
     * 优点： 1、职责清晰。 2、高扩展性。 3、智能化。
     * 缺点： 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
     * 使用场景： 1、远程代理。 2、虚拟代理。 3、Copy-on-Write 代理。 4、保护（Protect or Access）代理。 5、Cache代理。 6、防火墙（Firewall）代理。 7、同步化（Synchronization）代理。 8、智能引用（Smart Reference）代理。
     */
    public static void main(String[] args) {
        test();

    }


    private static void test() {

        Power power = new NewPower();
        power.run();
    }
}
