package com.EventManagement.UniversitySystem.Controller;

import com.EventManagement.UniversitySystem.Model.Event;
import com.EventManagement.UniversitySystem.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService service;

    @GetMapping("/getEventById/{id}")
    public Event getEventById(@PathVariable Integer id ){
        return service.getEventById(id);
    }
    @PostMapping("/addEvent")
    public String addEvent (@RequestBody Event newEvent){
        return service.addEvent(newEvent);
    }
    @PutMapping("/updateEvent/{id}/{date}")
    public String updateEvent(@PathVariable Integer id, @PathVariable String date){
        return service.updateEvent(id,date);
    }
    @DeleteMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return service.deleteEvent(id);
    }
    @GetMapping("/getAllEventByDate/{date}")
    public List<Event> getAllEventByDate(@PathVariable LocalDate date ){
        return service.findByDate(date);
    }

}
