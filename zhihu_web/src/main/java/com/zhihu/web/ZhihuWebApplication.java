package com.zhihu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zhihu"})
public class ZhihuWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhihuWebApplication.class, args);
	}

}
