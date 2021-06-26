package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(KodillaHomework kodillaHomework) {
        System.out.println(mentorName + ": New task to check from: in Kodilla Homework: " + kodillaHomework.getName()
                + "\n" + " (total: " + kodillaHomework.getTasks().size() + " tasks)"
                + "\n" + "New messages: " + kodillaHomework.getMessages().size());
    }
}
