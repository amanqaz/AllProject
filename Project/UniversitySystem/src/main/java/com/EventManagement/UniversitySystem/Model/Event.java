package com.EventManagement.UniversitySystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;

    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    private Time startTime;
    private Time endTime;
}
