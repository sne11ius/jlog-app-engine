package nu.wasis.jlog.model;

import com.github.jmkgreen.morphia.annotations.Embedded;

@Embedded
public class User {

    private String email;
    private String firstname;
    private String lastname;

    public User() {
    }

    public User(final String email, final String firstname, final String lastname) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

}
