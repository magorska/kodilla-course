package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("getToDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("getInProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("getDoneList")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}