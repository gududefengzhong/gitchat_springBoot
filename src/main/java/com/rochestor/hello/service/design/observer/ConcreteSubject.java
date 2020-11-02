package com.rochestor.hello.service.design.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends AbstractSubject{

    // ConcreteSubject 统一管理所有的观察者，待状态变更，主动提醒观察者做进一步动作。
    List<AbstractObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(AbstractObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }
}
