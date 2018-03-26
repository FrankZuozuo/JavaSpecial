package design.patten.appearance;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 9:59.
 * © All Rights Reserved.
 */
public class CPU implements OAC{
    @Override
    public void open() {
        System.out.println("CPU : open");
    }

    @Override
    public void close() {
        System.out.println("CPU : close");
    }
}
