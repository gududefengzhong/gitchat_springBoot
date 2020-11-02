package com.rochestor.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
//@PropertySource("application-defaults.properties") // 指定加载除了spring.properties 之外的配置文件
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);

//		ApplicationContext ctx = SpringApplication.run(HelloApplication.class, args);
//		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
//		for (String profile : activeProfiles) {
//			System.out.println("当前环境为 " + profile);
//		}
//
//		System.out.println("start resolve");
//		System.out.println(ctx.getEnvironment().resolvePlaceholders("${com.example.conditional:aaa}"));
//		System.out.println("stop resolve");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
