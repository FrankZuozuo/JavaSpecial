package design.patten.adapter.interfaceadapter;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 12:22.
 * © All Rights Reserved.
 */
public class Chat extends Wrapper{


    @Override
    public Port NET() {
        System.out.println("Hello world!");
        return this;
    }

    @Override
    public Port FTP() {
        System.out.println("File upload successful!");
        return this;
    }

    public static void start(){
        Chat chat = new Chat(){
            {
                NET().FTP();
            }
        };
    }


}
