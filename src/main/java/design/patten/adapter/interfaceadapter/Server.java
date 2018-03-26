package design.patten.adapter.interfaceadapter;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:23.
 * © All Rights Reserved.
 */
public class Server extends Wrapper {


    @Override
    public Port SSH() {
        System.out.println("Connect success!");
        return this;
    }

    @Override
    public Port NET() {
        System.out.println("Hello WWW!");
        return this;
    }

    @Override
    public Port Tomcat() {
        System.out.println("Tomcat is running!");
        return this;
    }

    @Override
    public Port Mysql() {
        System.out.println("Mysql is running!");
        return this;
    }

    public static void start(){
        Server server = new Server(){
            {
                SSH().NET().Mysql().Tomcat();
            }
        };
    }
}
