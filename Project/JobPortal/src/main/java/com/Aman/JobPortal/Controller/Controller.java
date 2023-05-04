package com.Aman.JobPortal.Controller;

import com.Aman.JobPortal.Model.JobSearch;
import com.Aman.JobPortal.Model.JobType;
import com.Aman.JobPortal.Services.JobServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    JobServices services;

    @GetMapping("/getAllJobs")
    public Iterable<JobSearch> getAll(){
        return services.getAllJob ();
    }

    @PostMapping("/addJobs")
    public String addJob(@RequestBody JobSearch data){
        return services.addJob(data);
    }
    @PostMapping("/addMultipleJobs")
    public String addMultipleJobs(@RequestBody  List<JobSearch> jobs){
        return services.addMultiplesJobs(jobs);
    }

    @GetMapping("/getJobByTitileAndDescription/{title}/{description}")
    public List<JobSearch>  getJobByTitileAndDescription (@PathVariable String title,@PathVariable String description){
        return services.getJobByTitileAndDescription(title,description);
    }

    @PutMapping("/jobType/{newType}/{id}")
    @Transactional
    public String updateJobType(@PathVariable Long id, @PathVariable JobType newType  ){
        return services.updateJobType(id,newType);
    }





}
