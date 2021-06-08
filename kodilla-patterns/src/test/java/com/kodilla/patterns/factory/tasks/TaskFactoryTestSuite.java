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
        Assertions.assertFalse(false);
        Assertions.assertEquals("Shopping task", shoppingTask.getTaskName());

    }
    @Test
    void testPaintingListFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTasksList(TaskFactory.PAINTINGTASK);
        //Then
        Assertions.assertFalse(false);
        Assertions.assertEquals("Painting list", paintingTask.getTaskName());
    }
    @Test
    void testDrivingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTasksList(TaskFactory.DRIVINGTASK);
        //Then
        Assertions.assertTrue(true);
        Assertions.assertEquals("Driving list", drivingTask.getTaskName());
    }
}
