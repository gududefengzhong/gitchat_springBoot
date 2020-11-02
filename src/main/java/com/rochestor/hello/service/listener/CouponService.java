package com.rochestor.hello.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    // 不同于 EmailService 的，设置监听事件的方法
    @EventListener
    public void addCoupon(UserRegisterEvent event) {
        logger.info("[addCoupon][给用户({}) 发放优惠券]", event.getUserName());
    }
}
