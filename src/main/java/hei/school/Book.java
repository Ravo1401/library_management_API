package hei.school;

import java.util.Date;

public class Book {
    private int iDBook;
    private String bookName;
    private int pageNumbers;
    private String topic;
    private Date releaseDate;
    private boolean availibility;


    public Book(int iDBook, String bookName, int pageNumbers, String topic, Date releaseDate, boolean availibility) {
        this.iDBook = iDBook;
        this.bookName = bookName;
        this.pageNumbers = pageNumbers;
        this.topic = topic;
        this.releaseDate = releaseDate;
        this.availibility = availibility;
    }
}
