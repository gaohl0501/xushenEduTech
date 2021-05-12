package com.xushen.testspring;

import com.xushen.email.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringbootApplication.class, MockServletContext.class})
public class ServiceTest {

    @Resource
    EmailService emailService;

    @Test
    public void testSend(){
        emailService.sendEmail("");

    }

}
