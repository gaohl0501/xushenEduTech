package com.xushen.email;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * E-mail工具类
 *
 * @author zhang.aojie
 * @date 2017/11/6
 */
@Slf4j
public class MailUtil {
    private static Logger log=Logger.getLogger(MailUtil.class);

//    private static AlarmProperties alarmProperties = ApplicationContextUtils
//            .getBean("alarmProperties", AlarmProperties.class);

    public static  String host ;
    public static  String port ;
    public static  String username ;
    public static  String password ;


    public static boolean sendMail(String subject, String content, String[] receivers) {
        HtmlEmail email = new HtmlEmail();
        try {
            email.setHostName(host);
            email.setSslSmtpPort(port);
            email.setCharset("UTF-8");
            email.addTo(receivers);
            email.setFrom(username, null);
            email.setSSLOnConnect(true);
            DefaultAuthenticator authenticator = new DefaultAuthenticator(username, password);
            email.setAuthenticator(authenticator);
            email.setSubject(subject);
            if (content.contains("<html>")) {
                email.setHtmlMsg(content);
            } else {
                email.setHtmlMsg("<html><head></head><body>" + content + "</body></html>");
            }
            email.send();
            log.info("发送邮件到" + Arrays.asList(receivers) + "成功");
            return true;
        } catch (Exception e) {
            log.error(username + ": " + port + "发送邮件到" + Arrays.asList(receivers) + "失败内容：" + content, e);
        }
        return false;
    }
}
