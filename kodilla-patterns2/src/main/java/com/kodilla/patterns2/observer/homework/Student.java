package com.kodilla.patterns2.observer.homework;

public class Student implements Observer {
    private final String studentName;
    private int updateCount;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(KodillaHomework kodillaHomework) {
        System.out.println(studentName + ": New task in Kodilla Homework: " + kodillaHomework.getName()
                + "\n" + " (total: " + kodillaHomework.getTasks().size() + " tasks)"
                + "\n" + "New messages: " + kodillaHomework.getMessages().size());
        updateCount++;
    }
}
