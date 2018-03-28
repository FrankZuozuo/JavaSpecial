package mail.provider;

import mail.MailProvider;
import mail.Mail;
import mail.factory.MailHostFactory;
import mail.factory.MailPort;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 14:33.
 * © All Rights Reserved.
 *
 * 请勿将此账户用于商业用途
 */
public class MailProviderByQQ implements MailProvider {


    @Override
    public Mail getMail() {

        Mail mail = new Mail() {
            {

                setMailServerHost(MailHostFactory._163Host());
                setMailServerPort(MailPort.SMTP_25);
                setFromAddress("347969164@qq.com");
                setUserName("347969164@qq.com");
                // 有些邮件需要使用签名，而不是密码
                setPassword("zzfegvogtpkwbgec");
                setValidate(true);
                setAttachFileNames(null);
            }
        };
        return mail;
    }
}
