package com.javapractice.designTypes.Observer_16;

import java.util.ArrayList;
import java.util.List;

class MyValue {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
abstract class Observer {
    protected MyValue subject;
    public abstract void update();
}
class PrinterObserver extends Observer{
    public PrinterObserver(MyValue subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Printer: " + subject.getState() );
    }
}
class EmailObserver extends Observer{

    public EmailObserver(MyValue subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Email: "+ subject.getState() );
    }
}
class FileObserver extends Observer{

    public FileObserver(MyValue subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("File: " + subject.getState());
    }
}
//观察者模式：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。
public class Main {
    public static void main(String[] args) {
        MyValue subject = new MyValue();

        new FileObserver(subject);
        new EmailObserver(subject);
        new PrinterObserver(subject);

        subject.setState(15);

        subject.setState(10);
    }
}

