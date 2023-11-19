package test;

import Repository.BookCrudOperations;
import entity.Book;
import entity.topic_enum;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void BookTest(){
        BookCrudOperations bookCrudOperations = new BookCrudOperations();
        Book book1 =  new Book(4, "Adventure", "Book1", 200, topic_enum.OTHER, java.sql.Date.valueOf("2022-01-01"), 1, "BORROWED");
        Book book2 = new Book(5, "Romance", "Book2", 150, topic_enum.ROMANCE, java.sql.Date.valueOf("2022-02-01"), 2, "AVAILABLE");
        Book book3 = new Book(6, "Comedy", "Book3", 180, topic_enum.COMEDY, java.sql.Date.valueOf("2022-03-01"), 3, "BORROWED" );
        // Test de findAll
        System.out.println("All Books:");
        bookCrudOperations.findAll();

        // Test de save
        bookCrudOperations.save(book1);
        System.out.println("Saving Book: " + book1);

        // Test de saveAll
        List<Book> booksToSave = new ArrayList<>();
        booksToSave.add(book2);
        booksToSave.add(book3);
        System.out.println("Saving Books:");
        for (Book book : booksToSave) {
            System.out.println(book);
        }
        List<Book> savedBooks = bookCrudOperations.saveAll(booksToSave);
        System.out.println("Saved Books:");
        for (Book savedBook : savedBooks) {
            System.out.println(savedBook);
        }

        // Test de delete
        Book bookToDelete = book1;
        System.out.println("Deletings Book: " + bookToDelete);
        Book deletedBook = bookCrudOperations.delete(bookToDelete);
        System.out.println("Deleteds Book: " + deletedBook);
    }
}
