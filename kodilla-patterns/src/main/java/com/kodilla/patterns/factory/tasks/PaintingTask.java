package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "To do in within: 4 days";
    }

    @Override
    public String getTaskName() {
        return "Painting list";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
