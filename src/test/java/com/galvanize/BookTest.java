package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void bookFormattedNameReturnsCorrectly() {
        Author author = new Author("Eric", "Evans");
        Publisher publisher = new Publisher("Addison-Wesley", "New York");
        Book book = new Book("Domain-Driven Design", 2004, author, publisher);

        String expected = "Domain-Driven Design (2004)\n" +
                "Written by Evans, Eric\n" +
                "Published by Addison-Wesley, New York";

        assertEquals(expected, book.getFormattedName());
    }

    @Test
    public void bookFormattedNameReturnsCorrectlyPart2(){
        Book book = new Book();
        Author author = new Author();
        Publisher publisher = new Publisher();
        book.setAuthor(author);
        book.setAuthorFirstName("Eric");
        book.setAuthorLastName("Evans");
        book.setTitle("Domain-Driven Design");
        book.setYear(2004);
        book.setPublisher(publisher);
        book.setPublisherName("Addison-Wesley");
        book.setPublisherCity("New York");

        String expected = "Domain-Driven Design (2004)\n" +
                "Written by Evans, Eric\n" +
                "Published by Addison-Wesley, New York";

        assertEquals(expected, book.getFormattedName());

    }

    @Test
    public void authorFormattedNameReturnsCorrectly(){
        Author author = new Author("Agatha", "Christie");
        String firstName = author.getFirstName();
        String lastName = author.getLastName();
        String expected = "Christie, Agatha";
        assertEquals(expected, author.getFormattedName());
    }

    @Test
    public void publisherFormattedNameReturnsCorrectly(){
        Publisher publisher = new Publisher("Penguin Random House", "London");
        String name = publisher.getName();
        String city = publisher.getCity();
        String expected = "Penguin Random House, London";
        assertEquals(expected, publisher.getFormattedName());
    }
}
