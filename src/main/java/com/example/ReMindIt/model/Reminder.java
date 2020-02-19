package com.example.ReMindIt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;

import java.time.format.DateTimeFormatter;

@IdClass(CompositeKey.class)
@Entity
@Table(name = "Reminders")
public class Reminder {

    @Id
    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User user;

    @Id
    @Column(name = "Date and Time", nullable = false)
    private DateTimeFormatter reminderDateTime;

    @Id
    @Column(name = "reminderName", nullable = false)
    private String reminderName;

    @Column(name = "Description", nullable = false)
    private String description;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DateTimeFormatter getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(DateTimeFormatter reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public String getReminderName() {
        return reminderName;
    }

    public void setReminderName(String reminderName) {
        this.reminderName = reminderName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
