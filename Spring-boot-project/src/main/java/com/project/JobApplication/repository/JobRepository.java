package com.project.JobApplication.repository;

import com.project.JobApplication.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

     //Derived query
     public List<Job> findByJobLocation(String jobLocation);

     //Custom query

     //Native query

     //Named query

     //Named Native





     //max salary


    //second max salary;


}
