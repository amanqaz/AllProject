package com.EventManagement.UniversitySystem.Repo;

import com.EventManagement.UniversitySystem.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface EventRepo extends CrudRepository<Event,Integer> {

    public List<Event> findByDate(LocalDate date);
}
