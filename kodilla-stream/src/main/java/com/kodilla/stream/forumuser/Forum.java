package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        getUserList();
    }

    public void getUserList() {
        usersList.add(new ForumUser("ide01", "Leigh", 'F', 1991, 06, 14, 3));
        usersList.add(new ForumUser("ide02", "Rick", 'M', 2002, 5, 30, 5));
        usersList.add(new ForumUser("ide03", "Jay", 'M', 1994, 10, 1, 2));
        usersList.add(new ForumUser("ide04", "Sarah", 'F', 2004, 9, 15, 0));
        usersList.add(new ForumUser("ide05", "Martin", 'M', 1993, 1, 27, 4));
        usersList.add(new ForumUser("ide06", "Cassandra", 'F', 1995, 4, 19, 5));
        usersList.add(new ForumUser("ide07", "Dave", 'M', 1999, 12, 3, 2));
        usersList.add(new ForumUser("ide08", "Amy", 'F', 1999, 2, 8, 10));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }

}
