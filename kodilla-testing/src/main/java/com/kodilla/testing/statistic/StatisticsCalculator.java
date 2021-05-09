package com.kodilla.testing.statistic;

import java.util.List;

public class StatisticsCalculator implements Statistic {

    private Statistic statistic;
    private int numOfUsers;
    private int numOfPosts;
    private int numOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    @Override
    public List<String> usersNames() {
        return null;
    }
    @Override
    public int postsCount() {
        return 0;
    }
    @Override
    public int commentsCount() {
        return 0;
    }
    public StatisticsCalculator(Statistic statistic) {
        this.statistic = statistic;
    }
//    public void calculateAdvStatistics(Statistics statistics) {
//
//    }
}
