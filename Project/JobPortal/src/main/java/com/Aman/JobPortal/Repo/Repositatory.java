package com.Aman.JobPortal.Repo;

import com.Aman.JobPortal.Model.JobSearch;
import com.Aman.JobPortal.Model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositatory extends CrudRepository<JobSearch,Integer> {
    public List<JobSearch> findByTitleAndDescription(String title,String desciption);

   //public List<JobSearch> saveAll(List<JobSearch> jobs);

    @Modifying
    @Query(value = "update job_search set jobtype = :newtype where id = :ID  ",nativeQuery = true)
    public void updateJobTypeById(String newtype,Long ID);

}
