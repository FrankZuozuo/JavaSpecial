package mail;

import lombok.SneakyThrows;
import mail.factory.MailProviderFactory;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 15:27.
 * © All Rights Reserved.
 */
public class Test {


    /**
     * QQ邮箱 ： 有些账户即使开通了smtp，pop3，imap服务并且拿到了授权码，也有可能是不支持发送的，因为QQ并没有对所有的账户开放这个权限。
     * 会一直抛出javax.mail.AuthenticationFailedException
     * <p>
     * 163邮箱 ： 以前的账户都是可以使用，越新的账户不能发送的可能性越大
     * 会一直抛出javax.mail.AuthenticationFailedException
     */

    public static void main(String[] args) {
        test();
    }

    @SneakyThrows
    private static void test(){


        Mail mail = MailProviderFactory.provider163("347969164@qq.com","测试邮件",html());
        SimpleMailSender mailSender = new SimpleMailSender(mail);
        mailSender.sendHtmlMail();
    }



    private static String html(){
        StringBuilder builder = new StringBuilder();
        StringBuilder body = new StringBuilder();
        builder.append("<table align=\"center\" style=\"margin: 20px 0;border: 1px solid #d1d1d1; border-collapse:collapse;");
        builder.append("text-align: center;width: 100%;white-space: pre-wrap\" cellspacing=\"0\" cellpadding=\"0\">");
        builder.append("    <tbody>");
        builder.append("        <tr style=\"font-size: 1em\">");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">序号</td>");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">标题</td>");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">内容</td>");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">数字</td>");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">颜色</td>");
        builder.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">你</td>");
        builder.append("        </tr>");
        body.append("        <tr style=\"font-size: 0.8em\">");
        body.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">1</td>");
        body.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">你好</td>");
        body.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">我是小明</td>");
        body.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">520</td>");
        body.append("           <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">red</td>");
        body.append("            <td style=\"border: 1px solid #d1d1d1;white-space: nowrap\">Onlinezuozuo</td>");
        body.append("        </tr>");
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append(body);
        builder.append("    </tbody>");
        builder.append("</table>");
        return builder.toString();
    }
}
