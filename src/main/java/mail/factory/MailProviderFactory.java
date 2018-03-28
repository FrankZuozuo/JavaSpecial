package mail.factory;

import mail.Mail;
import mail.provider.MailProviderBy163;
import mail.provider.MailProviderByQQ;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 14:31.
 * © All Rights Reserved.
 */
public class MailProviderFactory {



    public static Mail providerQQ(String to, String subject, String content){
        return new MailProviderByQQ().getMail().setToAddress(to).setSubject(subject).setContent(content);
    }



    public static Mail provider163(String to, String subject, String content){
        return new MailProviderBy163().getMail().setToAddress(to).setSubject(subject).setContent(content);
    }
}
