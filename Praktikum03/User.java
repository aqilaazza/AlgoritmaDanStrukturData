package Praktikum03;

public class User {
    String username;
    String password;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String gerUsername () {
        return username;
    }
    public void setUsername (String username) {
        this.username = username;
    }
    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public void loginUser () {
        System.out.println("User     : " + username);
        System.out.println("Password : " + password);
    }
}
