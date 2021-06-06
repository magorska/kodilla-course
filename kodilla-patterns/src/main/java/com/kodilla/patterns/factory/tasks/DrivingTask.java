package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isDone = true;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
    }

    @Override
    public String getTaskName() {
        return "Driving list";
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
