package design.patten.adapter.interfaceadapter;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:21.
 * © All Rights Reserved.
 * <p>
 * 定义抽象类实现端口接口，但是什么事情都不做
 */
public abstract class Wrapper implements Port {

    @Override
    public Port SSH() {
        return this;
    }

    @Override
    public Port NET() {
        return this;
    }

    @Override
    public Port Tomcat() {
        return this;
    }

    @Override
    public Port Mysql() {
        return this;
    }

    @Override
    public Port Oracle() {
        return this;
    }

    @Override
    public Port FTP() {
        return this;
    }
}
