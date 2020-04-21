package com.tuya.edge.start;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-application.xml")
public class Starter {

	public static void main(String[] args) {
		System.setProperty("file.encoding", "UFT-8");
		SpringApplication springApplication = new SpringApplication(Starter.class);
		//关闭banner图
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

}
