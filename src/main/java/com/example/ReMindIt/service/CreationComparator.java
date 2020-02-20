package com.example.ReMindIt.service;

import com.example.ReMindIt.model.Reminder;

import java.util.Comparator;

public class CreationComparator implements Comparator<Reminder> {

    public int compare(Reminder earlyReminder, Reminder lateReminder){
        return  earlyReminder.getReminderDateTime().compareTo(lateReminder.getReminderDateTime());
    }
}
