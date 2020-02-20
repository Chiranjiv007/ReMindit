package com.example.ReMindIt.model;
;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CompositeKey implements Serializable {

    private String userName;
    private String reminderName;
    private LocalDateTime reminderDateTime;

    public CompositeKey(String userName, String reminderName, LocalDateTime reminderDateTime){
        this.userName = userName;
        this.reminderDateTime = reminderDateTime;
        this.reminderName = reminderName;
    }



}
