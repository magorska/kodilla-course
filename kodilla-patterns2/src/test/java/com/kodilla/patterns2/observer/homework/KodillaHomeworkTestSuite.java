package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class KodillaHomeworkTestSuite {

    @Test
    void testUpdate() {

        //Given
        KodillaHomework task1 = new KodillaHomework("23.1 Facade");
        KodillaHomework task2 = new KodillaHomework("23.2 Decorator");
        KodillaHomework task3 = new KodillaHomework("23.3 Aspect");
        KodillaHomework task4 = new KodillaHomework("23.4 Observer");
        KodillaHomework task5 = new KodillaHomework("23.5 Adapter");

        task1.addTaskToCheck("");
        task2.addTaskToCheck("");
        task3.addTaskToCheck("");
        task4.addTaskToCheck("");
        task5.addTaskToCheck("");

        Student emli = new Student("Emma Lim");
        Student same = new Student("Sarah Meyer");
        Student jakr = new Student("Jay Kristoff");

        Mentor rima = new Mentor("Rick Martin");
        Mentor dama = new Mentor("Daniel MacHale");

        task1.registerObserver(rima);
        task2.registerObserver(dama);
        task3.registerObserver(rima);
        task4.registerObserver(rima);
        task5.registerObserver(dama);

        //When

        emli.update(task1);
        same.update(task2);
        jakr.update(task3);
        emli.update(task4);
        same.update(task5);



        //Then
        Assertions.assertEquals(2, dama.getUpdateCount());
        Assertions.assertEquals(3, rima.getUpdateCount());

    }
}
