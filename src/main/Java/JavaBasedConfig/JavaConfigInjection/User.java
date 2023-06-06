package JavaBasedConfig.JavaConfigInjection;

public class User {
    String firstName;
    String lastName;
    String email;
    long mobile;

    public User(String firstName, String lastName, String email, long mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
