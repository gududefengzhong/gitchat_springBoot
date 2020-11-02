package com.rochestor.hello.service.design.observer;

public class ConcreteObserver extends AbstractObserver {

    // 其他的观察者，可以继承 AbstractObserver 类，实现 update 方法
    @Override
    public void update() {
        System.out.println("concreteObserver has updated");
    }
}