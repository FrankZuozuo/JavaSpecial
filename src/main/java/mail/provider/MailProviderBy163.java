package mail.provider;

import mail.Mail;
import mail.MailProvider;
import mail.factory.MailHostFactory;
import mail.factory.MailPort;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 15:20.
 * © All Rights Reserved.
 *
 * 请勿将此账户用于商业用途
 */
public class MailProviderBy163 implements MailProvider{


    @Override
    public Mail getMail() {

        Mail mail = new Mail() {
            {

                setMailServerHost(MailHostFactory._163Host());
                setMailServerPort(MailPort.SMTP_25);
                setFromAddress("m15197447018@163.com");
                setUserName("m15197447018@163.com");
                // 有些邮件需要使用签名，而不是密码
                setPassword("woaini151");
                setValidate(true);
                setAttachFileNames(null);
            }
        };
        return mail;
    }


}
