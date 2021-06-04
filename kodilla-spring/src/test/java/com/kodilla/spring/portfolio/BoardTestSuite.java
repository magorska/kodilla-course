package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void toDoList() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        // When
        TaskList firstBoard = board.getToDoList();
        TaskList secondBoard = board.getInProgressList();
        TaskList thirdBoard = board.getDoneList();
        // Then
        Assertions.assertEquals(firstBoard, board.getToDoList());
        Assertions.assertEquals(secondBoard, board.getInProgressList());
        Assertions.assertEquals(thirdBoard, board.getDoneList());
    }
}
