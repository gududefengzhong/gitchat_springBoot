package com.rochestor.hello.service.design.observer;

public abstract class AbstractSubject {
    public abstract void addObserver(AbstractObserver observer);
    public abstract void delObserver(AbstractObserver observer);
    public abstract void notifyObservers();
}
