

import hei.school.ConnexionConfiguration;
import test.AuthorTest;
import test.BookTest;
import test.SubscribersTest;

import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AuthorTest.AuthorTest();
        SubscribersTest.SubcribersTest();
        BookTest.BookTest();
    }
}