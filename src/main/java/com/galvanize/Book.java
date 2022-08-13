package com.galvanize;

public class Book {

    private String bookTitle;
    private int bookYear;
    private Author author;
    private Publisher publisher;


    public String getTitle() {
        return bookTitle;
    }

    public void setTitle(String bookName) {
        this.bookTitle = bookName;
    }

    public int getYear() {
        return bookYear;
    }

    public void setYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public Book() {
    }

    public Book(String bookTitle, int bookYear, Author author, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.bookYear = bookYear;
        this.author = author;
        this.publisher = publisher;
    }


    public String getFormattedName() {
        return String.format(
                "%s (%s)\nWritten by %s\nPublished by %s",
                getTitle(),
                getYear(),
                this.author.getFormattedName(),
                this.publisher.getFormattedName()
        );
    }

    public void setAuthorFirstName(String firstName) {

        this.author.setFirstName(firstName);
    }

    public void setAuthorLastName(String lastName) {
        this.author.setLastName(lastName);
    }


    public void setPublisherName(String publisherName) {
        this.publisher.setName(publisherName);
    }


    public void setPublisherCity(String city) {
        this.publisher.setCity(city);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
