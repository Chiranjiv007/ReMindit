package com.example.ReMindIt.service;

import com.example.ReMindIt.dao.ReminderDao;
import com.example.ReMindIt.model.Reminder;
import com.example.ReMindIt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ReminderMYSQLServiceImpl implements IReminderMySQLService {

    @Autowired
    private ReminderDao reminderDao;

    @Override
    public void addReminder(Reminder reminder) {
        reminderDao.save(reminder);
    }

    @Override
    public List<Reminder> getAllRemindersOfUser(User user) {
        return reminderDao.getAllRemindersByUser(user.getUserName());
    }

    // TODO:
 /*   @Override
    public void updateReminder(Reminder reminder) {
        User user = reminder.getUser();

    }*/


    @Override
    public void deleteReminder(Reminder reminder) {
        LocalDateTime date = LocalDateTime.now();
        if(isReminderPending(reminder))
        {
            reminderDao.delete(reminder);
        }
    }

    @Override
    public List<Reminder> getPendingReminder(User user) {
        List<Reminder> reminderList = new ArrayList<>();

        for(Reminder reminder:user.getReminders()){
            if(isReminderPending(reminder))
            {
                reminderList.add(reminder);
            }
        }

        return reminderList;
    }

    @Override
    public List<Reminder> getPastReminder(User user) {

        List<Reminder> reminderList = new ArrayList<>();

        for(Reminder reminder:user.getReminders()){
            if(isReminderPast(reminder))
            {
                reminderList.add(reminder);
            }
        }
        return reminderList;
    }

    @Override
    public List<Reminder> sortAscendingToTime(List<Reminder> reminderList) {
        Collections.sort(reminderList, new CreationComparator());
        return reminderList;
    }

    @Override
    public List<Reminder> sortDescendingToTime(List<Reminder> reminderList) {
        Collections.reverse(sortAscendingToTime(reminderList));
        return reminderList;
    }

    private boolean isReminderPending(Reminder reminder){
        LocalDateTime date = LocalDateTime.now();
        return (reminder.getReminderDateTime().isAfter(date));
    }

    private boolean isReminderPast(Reminder reminder){
        return !isReminderPending(reminder);
    }

}
