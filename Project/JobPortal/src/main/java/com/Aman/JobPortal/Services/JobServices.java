package com.Aman.JobPortal.Services;

import com.Aman.JobPortal.Model.JobSearch;
import com.Aman.JobPortal.Model.JobType;
import com.Aman.JobPortal.Repo.Repositatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServices
{
    @Autowired
    Repositatory database;

    public String addJob(JobSearch data) {
        database.save ( data );
        return "user added";
    }

    public Iterable<JobSearch> getAllJob() {
        return database.findAll ();
    }

    public List<JobSearch> getJobByTitileAndDescription(String title, String description) {
        return  database.findByTitleAndDescription ( title,description );

    }

    public String addMultiplesJobs(Iterable<JobSearch> jobs) {
        database.saveAll( jobs );
        return "seccessful thank you";
    }

    public String updateJobType(Long id, JobType newType) {

        String temp = newType.name();

        database.updateJobTypeById ( temp,id );
        return "updated";

    }
}
