package Models;

public class User {
    int randomNumber = (int)Math.floor(Math.random()*100);
    private String name = "Pawel";
    private String lastName = "Laski";
    private String email = "pawellaski" + randomNumber + "@email.pl";
    private String password = "Password123!";

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
