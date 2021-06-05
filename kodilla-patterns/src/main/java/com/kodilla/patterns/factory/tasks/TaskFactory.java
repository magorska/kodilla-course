package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTasksList(final String tasksClass) {
        switch (tasksClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "milk", 2);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "blue", "Front door");
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "Warsaw", "by train");
            default:
                return null;
        }
    }
}
