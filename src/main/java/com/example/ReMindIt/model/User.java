package com.example.ReMindIt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="User")
public class User {

    @Id
    @Column(name = "username", nullable = false)
    private String userName;

    @Column(name = "First Name", nullable = false)
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name = "Password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Reminder> reminders;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
