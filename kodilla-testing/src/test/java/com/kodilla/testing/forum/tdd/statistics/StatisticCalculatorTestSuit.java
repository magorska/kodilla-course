package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(0);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(0, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticWithThousandPosts() {
        // Given
        Statistic statisticMock = mock(Statistic.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statisticMock.postsCount()).thenReturn(1000);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        // Then
        Assertions.assertEquals(1000, statisticsCalculator.getNumOfPosts());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculator.getAverageOfCommentsPerPost());
    }




}
