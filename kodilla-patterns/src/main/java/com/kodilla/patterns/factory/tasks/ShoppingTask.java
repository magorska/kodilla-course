package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "To do in within: 2 days";
    }

    @Override
    public String getTaskName() {
        return "Shopping task";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
