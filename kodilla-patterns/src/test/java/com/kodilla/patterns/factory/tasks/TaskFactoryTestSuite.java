package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingListFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTasksList(TaskFactory.SHOPPINGTASK);
        //Then
        Assertions.assertEquals("To do in within: 2 days", shoppingTask.executeTask());
        Assertions.assertEquals("Shopping task", shoppingTask.getTaskName());
        Assertions.assertEquals(true, shoppingTask.isTaskExecuted());
    }
    @Test
    void testPaintingListFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTasksList(TaskFactory.PAINTINGTASK);
        //Then
        Assertions.assertEquals("To do in within: 4 days", paintingTask.executeTask());
        Assertions.assertEquals("Painting list", paintingTask.getTaskName());
        Assertions.assertEquals(false, paintingTask.isTaskExecuted());
    }
    @Test
    void testDrivingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTasksList(TaskFactory.DRIVINGTASK);
        //Then
        Assertions.assertEquals("To do in within: next Sunday", drivingTask.executeTask());
        Assertions.assertEquals("Driving list", drivingTask.getTaskName());
        Assertions.assertEquals(false, drivingTask.isTaskExecuted());
    }
}
