package com.rochestor.hello.service.runner;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {
    Environment environment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("11111111111");
        System.out.println(environment.getProperty("aaa.name"));
        System.out.println(Strings.join(Arrays.asList(environment.getActiveProfiles()), ','));
        // 返回 .bashrc 中设置的 path 信息
        System.out.println(Strings.join(System.getenv().values(), ','));
        System.out.println(Strings.join(System.getProperties().values(), ','));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
