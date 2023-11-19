package entity;

public class Author {
    private  int authorid ;
    private String AuthorName ;
    private String sex ;

    public Author(int id, String authorName, String sex) {
        this.authorid = id;
        AuthorName = authorName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + authorid +
                ", AuthorName='" + AuthorName + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getId() {
        return authorid;
    }

    public void setId(int id) {
        this.authorid = id;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
