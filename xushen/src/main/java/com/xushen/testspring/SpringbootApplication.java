package com.xushen.testspring;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName:SpringbootApplication  
 * @Description:SpringBoot 初始化启动加载类
 * @author zzy
 * @date 2018年11月7日
 * @version V1.0
 */
@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
@ComponentScan("com.ule.returnrefund")
public class SpringbootApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}