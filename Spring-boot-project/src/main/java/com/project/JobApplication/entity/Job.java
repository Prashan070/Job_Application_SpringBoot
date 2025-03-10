package com.project.JobApplication.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    private String jobName;

    private String jobLocation;

    private Long jobSalary;

    @Column(name = "jobDetails")
    private String jobDescription;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Long getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(Long jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Job(Long jobId, String jobName, String jobLocation, Long jobSalary, String jobDescription) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobLocation = jobLocation;
        this.jobSalary = jobSalary;
        this.jobDescription = jobDescription;
    }

    public Job() {
    }
}
