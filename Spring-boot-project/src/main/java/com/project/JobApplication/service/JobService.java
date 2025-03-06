package com.project.JobApplication.service;

import com.project.JobApplication.jobDTO.JobRequestDTO;
import com.project.JobApplication.jobDTO.JobResponseDTO;

import java.util.List;

public interface JobService {


   public boolean saveNewJob(JobRequestDTO jobRequestDTO);

   public List<JobResponseDTO> getAllJobs();

    public JobResponseDTO getJobById(JobRequestDTO jobRequestDTO);

    public boolean deleteJobById(JobRequestDTO jobRequestDTO);

    public boolean updateExistingJob(JobRequestDTO jobRequestDTO);
}
