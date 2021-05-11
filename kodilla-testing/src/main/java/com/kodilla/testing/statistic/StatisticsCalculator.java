package com.kodilla.testing.statistic;

import java.util.List;


public class StatisticsCalculator {
    private Statistic statistic;
    private int numOfUsers;
    private int numOfPosts;
    private int numOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    public StatisticsCalculator(Statistic statistic) {
        this.statistic = statistic;
    }

    public void calculateAdvStatistics(Statistic statistics) {
        numOfUsers = statistics.usersNames().size();
        numOfPosts = statistics.postsCount();
        numOfComments = statistics.commentsCount();
        averageOfPostsPerUser = calculatePostsPerUser();
        averageOfCommentsPerUser = calculateCommentsPerUser();
        averageOfCommentsPerPost = calculateCommentsPerPost();

    }
    private double calculatePostsPerUser() {
        if (numOfUsers > 0) {
            double calculate = numOfPosts / numOfUsers;
            return calculate;
        } else {
            return 0;
        }
    }
    private double calculateCommentsPerUser() {
        if (numOfUsers > 0) {
            double calculate = numOfComments/numOfUsers;
            return calculate;
        } else {
            return 0;
        }
    }
    private double calculateCommentsPerPost() {
        if (numOfUsers > 0) {
            double calculate = numOfComments/numOfPosts;
            return calculate;
        } else {
            return 0;
        }
    }
    public void showStatistics() {
        System.out.println("Number of User: " + numOfUsers);
        System.out.println("Number of posts: " + numOfPosts);
        System.out.println("Number of comments: " + numOfComments);
        System.out.println("Average number of posts per User: " + averageOfPostsPerUser);
        System.out.println("Average number of comments per User: " + averageOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageOfCommentsPerPost);
    }
}
