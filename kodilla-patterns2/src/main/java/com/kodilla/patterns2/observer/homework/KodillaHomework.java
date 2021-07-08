package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaHomework implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final List<String> messages;
    private final String name;

    public KodillaHomework(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addTaskToCheck(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
