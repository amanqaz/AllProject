package com.EventManagement.UniversitySystem.Service;

import com.EventManagement.UniversitySystem.Model.Event;
import com.EventManagement.UniversitySystem.Repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.example.demo.Service"})
public class EventService {
    @Autowired
    EventRepo database;
    public Event getEventById(Integer id){
        return database.findById ( id ).get();

    }

    public String addEvent(Event newEvent) {
        database.save(newEvent);
        return "added on database";
    }

    public String updateEvent(Integer id, String newDate) {
        Event event = database.findById ( id ).get();
        LocalDate date = LocalDate.parse (newDate );
        event.setDate( date );
        database.save(event);
        return "update seccessfull";
    }

    public String deleteEvent(Integer id) {
        database.deleteById ( id );
        return "delete successful";
    }

    public List<Event> findByDate(LocalDate date) {
        return database.findByDate (date);

    }
}
