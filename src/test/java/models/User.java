package models;

import lombok.Data;
@Data
public class User {

    private int randomNumber = (int)Math.floor(Math.random()*100);
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public User(String name, String lastName, String email, String password, String confirmPassword) {
        this.name = name;
        this.lastName = lastName;
        this.email = randomNumber + email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
