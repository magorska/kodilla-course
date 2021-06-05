package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        // Given
        Library library = new Library("My Library");
        Book book1 = new Book("Aurora Rising", "Jay Kristoff & Amie Kaufman", LocalDate.of(2019,1,27));
        Book book2 = new Book("Aurora Burning", "Jay Kristoff & Amie Kaufman", LocalDate.of(2020,5,9));
        Book book3 = new Book("Aurora's Ending", "Jay Kristoff & Amie Kaufman", LocalDate.of(2021, 12 ,03));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library.getBooks().remove(book3);

        // Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());


    }
}
