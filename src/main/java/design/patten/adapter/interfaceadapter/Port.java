package design.patten.adapter.interfaceadapter;

import consts.IDEWarnType;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:20.
 * © All Rights Reserved.
 */

public interface Port {

    // 远程SSH端口22
    Port SSH();

    // 网络端口80
    Port NET();

    // Tomcat容器端口8080
    Port Tomcat();

    // Mysql数据库端口3306
    Port Mysql();

    // Oracle数据库端口1521
    Port Oracle();

    // 文件传输FTP端口21
    Port FTP();
}
