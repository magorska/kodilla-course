package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final String usersUniqueIdentyficator;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numOfPosts;


    public ForumUser(String usersUniqueIdentyficator, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numOfPosts) {
        this.usersUniqueIdentyficator = usersUniqueIdentyficator;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numOfPosts = numOfPosts;
    }

    public String getUsersUniqueIdentyficator() {
        return usersUniqueIdentyficator;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public LocalDate getBirthdayDate() {
        return birthDate;
    }
}
