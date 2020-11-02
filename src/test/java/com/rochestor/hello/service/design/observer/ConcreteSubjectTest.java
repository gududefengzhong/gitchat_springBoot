package com.rochestor.hello.service.design.observer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ConcreteSubjectTest {

    @Test
    public void subjectTest() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // add observers
        concreteSubject.addObserver(new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("小王，赶紧去打卡");
            }
        });

        concreteSubject.addObserver(new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("小李，赶紧去打卡");
            }
        });

        concreteSubject.addObserver(new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("小王八蛋，赶紧去打卡");
            }
        });

        concreteSubject.notifyObservers();
    }

}