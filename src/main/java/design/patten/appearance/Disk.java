package design.patten.appearance;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:01.
 * © All Rights Reserved.
 */
public class Disk implements OAC{

    @Override
    public void open() {
        System.out.println("Disk : open");
    }

    @Override
    public void close() {
        System.out.println("Disk : close");
    }
}
