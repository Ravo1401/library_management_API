package hei.school;

public class Visitors extends User{
    private String references;
    public Visitors(int idUser, String name, String dateOfBirth, String email, String references) {
        super(idUser, name, dateOfBirth, email);

        this.references = references;
    }
}
