package com.rochestor.hello.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class UserService implements ApplicationEventPublisherAware {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private ApplicationEventPublisher applicationEventPublisher;

    // 实现 ApplicationEventPublisherAware 接口，从而将 ApplicationEventPublisher 注册到其中
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String userName) {
        // ... 执行注册的逻辑
        logger.info("[register][执行用户({}) 的注册逻辑]", userName);

        // ... 发布
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, userName));
    }
}
