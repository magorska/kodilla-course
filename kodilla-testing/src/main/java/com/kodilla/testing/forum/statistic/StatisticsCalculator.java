package com.kodilla.testing.forum.statistic;


public class StatisticsCalculator {


    private int numOfUsers;
    private int numOfPosts;
    private int numOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;


    public void calculateAdvStatistics(Statistic statistics) {
        numOfUsers = statistics.usersNames().size();
        numOfPosts = statistics.postsCount();
        numOfComments = statistics.commentsCount();
        averageOfPostsPerUser = calculatePostsPerUser();
        averageOfCommentsPerUser = calculateCommentsPerUser();
        averageOfCommentsPerPost = calculateCommentsPerPost();

    }
    public double calculatePostsPerUser() {
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
    public double calculateCommentsPerPost() {
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

    public int getNumOfUsers() {
        return numOfUsers;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }

    public double getAverageOfCommentsPerUser() {
        return averageOfCommentsPerUser;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }
}
