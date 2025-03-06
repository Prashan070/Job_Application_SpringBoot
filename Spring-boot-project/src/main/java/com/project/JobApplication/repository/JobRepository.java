package com.project.JobApplication.repository;

import com.project.JobApplication.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {


    //max salary
    //second max salary;


}
