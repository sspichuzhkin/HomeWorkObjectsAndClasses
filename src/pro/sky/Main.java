package pro.sky;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("firstName1", "lastName1", "authorFullName1");
        Author author2 = new Author("firstName2", "lastName2", "authorFullName2");
        Book book1 = new Book("bookName1", author1, 2020);
        Book book2 = new Book("bookName2", author2, 2021);
        book1.setPublishingYear(2022);
        System.out.println("New PublishingYear of " + book1.getBookName() + " is " + book1.getPublishingYear() + " " + book1.getAuthorFullName());
        System.out.println(book1);
    }
}