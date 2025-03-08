package com.project.JobApplication.service;

import com.project.JobApplication.entity.Job;
import com.project.JobApplication.jobDTO.JobRequestDTO;
import com.project.JobApplication.jobDTO.JobResponseDTO;
import com.project.JobApplication.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
                jobRequestDTO.getJobSalaryReqDTO(),
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
                    jobs.getJobLocation(),
                    jobs.getJobSalary()));
        }
        return jobResponseDTO;
    }

    @Override
    public JobResponseDTO getJobById(JobRequestDTO jobRequestDTO) {

        Optional<Job> existingJob = jobRepository.findById(jobRequestDTO.getJobIdReqDTO());

        if (existingJob.isPresent()) {

            Job resultJob = existingJob.get();

            return new JobResponseDTO(resultJob.getJobId(),
                    resultJob.getJobName(),
                    resultJob.getJobLocation(),
                    resultJob.getJobDescription(),
                    resultJob.getJobSalary());

        }
        return null;
    }

    @Override
    public boolean deleteJobById(JobRequestDTO jobRequestDTO) {

        boolean isAvaiable = jobRepository.existsById(jobRequestDTO.getJobIdReqDTO());
        if (isAvaiable) {
            jobRepository.deleteById(jobRequestDTO.getJobIdReqDTO());
            return true;
        }
        return false;
    }


    @Override
    public boolean updateExistingJob(JobRequestDTO jobRequestDTO) {

        Optional<Job> existingJobOpt = jobRepository.findById(jobRequestDTO.getJobIdReqDTO());

        if (existingJobOpt.isPresent()) {

            Job existingJob = existingJobOpt.get();

            if (jobRequestDTO.getJobDescriptionReqDTO() != null && !jobRequestDTO.getJobDescriptionReqDTO().isBlank()) {
                existingJob.setJobDescription(jobRequestDTO.getJobDescriptionReqDTO());
            }
            if (jobRequestDTO.getJobNameReqDTO() != null && !jobRequestDTO.getJobNameReqDTO().isBlank()) {
                existingJob.setJobName(jobRequestDTO.getJobNameReqDTO());
            }
            if (jobRequestDTO.getJobLocationReqDTO() != null && !jobRequestDTO.getJobLocationReqDTO().isBlank()) {
                existingJob.setJobLocation(jobRequestDTO.getJobLocationReqDTO());
            }
            if (jobRequestDTO.getJobSalaryReqDTO() != null) {
                existingJob.setJobSalary(jobRequestDTO.getJobSalaryReqDTO());
            }

            jobRepository.save(existingJob);

            return true;
        }
        return false;


    }

    @Override
    public List<JobResponseDTO> getJobWithSpecificLocation(JobRequestDTO jobRequestDTO) {
        List<Job> existJob = jobRepository.findByJobLocation(jobRequestDTO.getJobLocationReqDTO());

        List<JobResponseDTO> jobResponseDTO = new ArrayList<>();

        if (existJob != null) {
            for (Job jobs : existJob) {
                jobResponseDTO.add(new JobResponseDTO(jobs.getJobId(),
                        jobs.getJobName(),
                        jobs.getJobDescription(),
                        jobs.getJobLocation(),
                        jobs.getJobSalary()));
            }
            return jobResponseDTO;
        }
        return null;
    }



}



