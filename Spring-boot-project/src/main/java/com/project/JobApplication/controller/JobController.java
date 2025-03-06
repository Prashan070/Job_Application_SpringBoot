package com.project.JobApplication.controller;


import com.project.JobApplication.jobDTO.JobRequestDTO;
import com.project.JobApplication.jobDTO.JobResponseDTO;
import com.project.JobApplication.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }


    @PostMapping
    public ResponseEntity<String> saveNewJob(@RequestBody JobRequestDTO jobRequestDTO) {
        boolean isSaved = jobService.saveNewJob(jobRequestDTO);
        if (isSaved) {
            return new ResponseEntity<>("Job has been saved", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public List<JobResponseDTO> getAllJobs() {
        return jobService.getAllJobs();
    }


    @GetMapping("/{id}")
    public ResponseEntity<JobResponseDTO> getJobById(@PathVariable("id") Long jobId) {
        JobRequestDTO jobRequestDTO = new JobRequestDTO();
        jobRequestDTO.setJobIdReqDTO(jobId);

        JobResponseDTO jobResponseDTO = jobService.getJobById(jobRequestDTO);
        /*if (jobResponseDTO != null) {
            return new ResponseEntity<>(jobResponseDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }*/

        return ResponseEntity.of(Optional.ofNullable(jobResponseDTO));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable("id") Long jobId) {
        JobRequestDTO jobRequestDTO = new JobRequestDTO();
        jobRequestDTO.setJobIdReqDTO(jobId);
        boolean isdeleted = jobService.deleteJobById(jobRequestDTO);
        if (isdeleted) {
            return new ResponseEntity<>("Job has been deleted", HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateExistingJob(@PathVariable("id") Long jobid, @RequestBody JobRequestDTO jobRequestDTO) {

        jobRequestDTO.setJobIdReqDTO(jobid);

        boolean isUpdated = jobService.updateExistingJob(jobRequestDTO);

        if (isUpdated) {
            return new ResponseEntity<>("Job has been updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }




}
