package com.example.ReMindIt.dao;

import com.example.ReMindIt.model.Reminder;
import com.example.ReMindIt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReminderDao extends JpaRepository<Reminder, User> {


//    @Query("SELECT r FROM Reminder r WHERE r.username = ?1")
    List<Reminder> getAllRemindersByUser(User user);

//    List<Reminder> getPendingReminders(User user);
//
//    List<Reminder> getPastReminders(User user);
//
//    List<Reminder> sortAscendinglyWithTime(User user);
//
//    List<Reminder> sortDescendinglyWithTime(User user);
}
