package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculatorTestSuit {

    @Test
    void testCalculateAdvStatisticsWithZeroPost() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersName = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersName.add("User" + i);
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(usersName);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(0, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfPostsPerUser(), 0.01);
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerPost(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithThousandPosts() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersName = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersName.add("User" + i);
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(usersName);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(1000, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(10, statisticsCalculator.getAverageOfPostsPerUser(), 0.01);
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerPost(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithZeroComments() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersName = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersName.add("Name" + i);
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(usersName);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(0, statisticsCalculator.getNumOfComments());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerUser(),0.01);
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerPost(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithLessCommentsThanPosts() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(10);
        when(statisticMock.commentsCount()).thenReturn(5);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(5, statisticsCalculator.getNumOfComments());
        Assertions.assertEquals(10, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(0.5, statisticsCalculator.getAverageOfCommentsPerPost(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithMoreCommentsThanPosts() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(5);
        when(statisticMock.commentsCount()).thenReturn(10);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(10, statisticsCalculator.getNumOfComments());
        Assertions.assertEquals(5, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(2.0, statisticsCalculator.getAverageOfCommentsPerPost(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithZeroUsers() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersName = new ArrayList<String>();
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(usersName);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(0, statisticsCalculator.getNumOfUsers());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerUser(), 0.01);
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfPostsPerUser(), 0.01);
    }
    @Test
    void testCalculateAdvStatisticWithHundredsUsers() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersName = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersName.add("Name" + i);
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.commentsCount()).thenReturn(120);
        when(statisticMock.usersNames()).thenReturn(usersName);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(100, statisticsCalculator.getNumOfUsers());
        Assertions.assertEquals(1.2, statisticsCalculator.getAverageOfCommentsPerUser(), 0.01);
        Assertions.assertEquals(1.0, statisticsCalculator.getAverageOfPostsPerUser(), 0.01);
    }

}
