package com.example.ReMindIt.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;
import java.util.List;

@Entity
@Table(name="User")
public class User {

    @Id
    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "First_Name", nullable = false)
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Reminder> reminders;

//    @OneToMany
//    private List<Role> roles;

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

    public List<Reminder> getReminders(){
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }

}
