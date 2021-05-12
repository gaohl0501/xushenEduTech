package com.xushen;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import org.springframework.session.data.redis.config.ConfigureRedisAction;

@SpringBootApplication
@ServletComponentScan
//@MapperScan(basePackages = {"com.shenma.run.cron.mapper"})
@ImportResource
public class XushenApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XushenApplication.class);
    }

//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }

    public static void main(final String[] args) {
        HashMap m=new HashMap();
        List s=new ArrayList<>();
        System.out.println(Math.pow(2,33));
    }
}

