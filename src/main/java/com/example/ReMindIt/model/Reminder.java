package com.example.ReMindIt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@IdClass(CompositeKey.class)
@Table(name = "Reminders")
public class Reminder {

    @Id
    @ManyToOne
    @JoinColumn(name = "userName", nullable = false)
    private String userName;

    @Id
    @Column(name = "Date_Time", nullable = false)
    private LocalDateTime reminderDateTime;

    @Id
    @Column(name = "ReminderName", nullable = false)
    private String reminderName;

    @Column(name = "Description", nullable = false)
    private String description;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
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
