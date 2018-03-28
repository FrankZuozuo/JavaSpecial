package mail;

import lombok.NoArgsConstructor;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 14:16.
 * © All Rights Reserved.
 */

@NoArgsConstructor
public class MailAuthenticator extends Authenticator{

    String userName = null;
    String password = null;


    public MailAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }

}
