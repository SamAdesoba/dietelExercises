package Assignments.EStore;

public class Admin {

    private int age;
    private String email;
    private String userName;
    private String password;

    public Admin(int age, String email, String userName) {
        this.age = age;
        this.email = email;
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
}
