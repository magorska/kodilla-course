package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("Jay Kristoff", "Nevernight", 2012, "#123");
        Book book2 = new Book("Amie Kauffman and Jay Kristoff", "Illumiane", 2015, "#065");
        Book book3 = new Book("Sarah J. Maas", "Throne of Glass", 2008, "#432");
        Book book4 = new Book("Leigh Bardugo", "Shadow and bone", 2013, "#212");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assertions.assertEquals(2013, median);


    }


}
