package com.xushen.email;/**
 * @Author:Created by sh00974
 * @Date on 2018/7/18.
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *@author gaohailiang
 *@date created on 2018/7/18
 */
@Slf4j
@Service
public class EmailService {
    private Logger log=Logger.getLogger(EmailService.class);
    public void sendEmail(String... receivers) {
        InputStream in = null;
        try {

            in = this.getClass().getResourceAsStream("/static/email.html");
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss"));
            String s = IOUtils.toString(in, "UTF-8");
//            String env = getEnvironment();

            String content = s.replace("\n", "<br />").replace("\r", "")
                    .replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");

            String htmlMsg = s.replace("#SYSTEM#", "".replace("#TIME#", time)
                    .replace("#LEVEL#", "CONTENT".replace("#CONTENT#", content)
                    .replace("#SUBJECT#", "")
                    .replace("#ENVIRONMENT#", "")));
            MailUtil.sendMail("[" + "level" + "] [" + "evn" + "] ["
                    + "sys" + "] " + "subject", htmlMsg, receivers);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
            }
        }
    }
}
