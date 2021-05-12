package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.interate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
        System.out.println("Task 7.1 \n");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifulText = poemBeautifier.beautify("Text to beautify", text -> "***" + text + "***");
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", text -> text.toUpperCase());
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", text -> text.toLowerCase());
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Text to beautify",text -> text.replace(" ","&"));
        System.out.println(beautifulText4);

        String beautifulText5 = poemBeautifier.beautify("Text to beautify", text -> text.repeat(3));
        System.out.println(beautifulText5);

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .forEach(System.out::println);
//        System.out.println("\n");
//
//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .forEach(System.out::println);
//        System.out.println("\n");
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);
//        System.out.println("\n");
//
//            BookDirectory theBookDirectory = new BookDirectory();
//            theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .forEach(System.out::println);
//        System.out.println("\n");
//
//        BookDirectory theBookDirectory2 = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory2.getList().stream()   // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
//                .collect(Collectors.toList());                                       // [3]
//
//        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
//        theResultListOfBooks.stream()                                           // [5]
//                .forEach(System.out::println);
//        System.out.println("\n");
//
        BookDirectory theBookDirectory3 = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);
        System.out.println("\n");

//        BookDirectory theBookDirectory4 = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory4.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);

        System.out.println("\n Task 7.3 \n");

        Forum forumUsers = new Forum();
        Map<String, ForumUser> theResultOfForumUser = forumUsers.getList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser-> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getUsersUniqueIdentyficator, forumUser -> forumUser));
        System.out.println(theResultOfForumUser);

        theResultOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);







    }
}

