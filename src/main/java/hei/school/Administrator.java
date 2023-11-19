package hei.school;

public class Administrator extends User{
    private String password ;
    public Administrator(String id, String name,String password) {
        super(Integer.parseInt(id), name);
        this.password = password ;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
