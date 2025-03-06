package com.project.JobApplication.service;

import com.project.JobApplication.entity.Job;
import com.project.JobApplication.jobDTO.JobRequestDTO;
import com.project.JobApplication.jobDTO.JobResponseDTO;
import com.project.JobApplication.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public boolean saveNewJob(JobRequestDTO jobRequestDTO) {

        Job job = new Job(null,
                jobRequestDTO.getJobNameReqDTO(),
                jobRequestDTO.getJobLocationReqDTO(),
                jobRequestDTO.getJobDescriptionReqDTO());
        jobRepository.save(job);
        return true;
    }

    @Override
    public List<JobResponseDTO> getAllJobs() {
        List<Job> existingJob = jobRepository.findAll();

        List<JobResponseDTO> jobResponseDTO = new ArrayList<>();
        for (Job jobs : existingJob) {
            jobResponseDTO.add(new JobResponseDTO(jobs.getJobId(),
                    jobs.getJobName(),
                    jobs.getJobDescription(),
                    jobs.getJobLocation()));
        }
        return jobResponseDTO;
    }

    @Override
    public JobResponseDTO getJobById(JobRequestDTO jobRequestDTO) {
        return null;
    }

    @Override
    public boolean deleteJobById(JobRequestDTO jobRequestDTO) {
        return false;
    }


}
