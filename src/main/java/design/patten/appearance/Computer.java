package design.patten.appearance;

import lombok.AllArgsConstructor;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 10:01.
 * © All Rights Reserved.
 */

@AllArgsConstructor
public class Computer implements OAC {


    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    @Override
    public void open() {
        cpu.open();
        disk.open();
        memory.open();
        System.out.println("Computer : open");
    }

    @Override
    public void close() {
        cpu.close();
        disk.close();
        memory.close();
        System.out.println("Computer : close");
    }
}
