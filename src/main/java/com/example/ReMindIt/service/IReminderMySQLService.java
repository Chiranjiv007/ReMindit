package com.example.ReMindIt.service;

import com.example.ReMindIt.model.Reminder;
import com.example.ReMindIt.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IReminderMySQLService {

    @Transactional
    public void addReminder(Reminder reminder);

    public List<Reminder> getAllRemindersOfUser(User user);

//    public void updateReminder (Reminder reminder);

    public void deleteReminder(Reminder reminder);

    public List<Reminder> getPendingReminder(User user);

    public List<Reminder> getPastReminder(User user);

    public List<Reminder> sortAscendingToTime(List<Reminder> reminderList);

    public List<Reminder> sortDescendingToTime(List<Reminder> reminderList);
}
