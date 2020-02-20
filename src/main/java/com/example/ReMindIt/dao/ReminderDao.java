package com.example.ReMindIt.dao;

import com.example.ReMindIt.model.Reminder;
import com.example.ReMindIt.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReminderDao extends CrudRepository<Reminder, User> {


    @Query("SELECT r FROM Reminder r WHERE r.username = ?1")
    List<Reminder> getAllRemindersByUser(String username);

//    List<Reminder> getPendingReminders(User user);
//
//    List<Reminder> getPastReminders(User user);
//
//    List<Reminder> sortAscendinglyWithTime(User user);
//
//    List<Reminder> sortDescendinglyWithTime(User user);
}
