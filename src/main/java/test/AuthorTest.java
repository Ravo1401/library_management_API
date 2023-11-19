package test;

import Repository.AuthorCrudOperations;
import entity.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorTest {
    public static void AuthorTest(){
        AuthorCrudOperations authorCrudOperations = new AuthorCrudOperations() ;
        authorCrudOperations.findAll() ;

        Author author = new Author(8,"Ravo" , "M") ;
        authorCrudOperations.save(author) ;

        List<Author> authorsToSave = new ArrayList<>();
        authorsToSave.add(new Author(6 , "Soa" , "F")) ;
        authorsToSave.add(new Author(7  ,"Malala" , "F")) ;
        List<Author> savedAuthors = authorCrudOperations.saveAll(authorsToSave);
        System.out.println("Saved Authors:");
        for (Author authors : savedAuthors) {
            System.out.println(authors);
        }
        Author authorToDelete = author;
        Author deletedAuthor = authorCrudOperations.delete(authorToDelete);
        System.out.println("Deleted Author: " + deletedAuthor);
    }
}
