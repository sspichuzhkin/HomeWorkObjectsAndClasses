package pro.sky;

import java.util.Objects;

public class Book {

    private final String bookName;
    private final Author authorFullName;
    private int publishingYear;

    public Book(String bookName, Author authorFullName, int publishingYear) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book`s " +
                "bookName='" + bookName + '\'' + " " +
                authorFullName.toString() +
                ", publishingYear=" + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return authorFullName.equals(book.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFullName);
    }
}
