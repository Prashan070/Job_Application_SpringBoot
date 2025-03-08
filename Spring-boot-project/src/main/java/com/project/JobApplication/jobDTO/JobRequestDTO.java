package com.project.JobApplication.jobDTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

public class JobRequestDTO {

    private Long jobIdReqDTO;

    @NotBlank(message = "Please add Job name")
    private String jobNameReqDTO;

    private String jobLocationReqDTO;

    @Length(max = 20, min =1)
    private String jobDescriptionReqDTO;

    @Positive
    private Long jobSalaryReqDTO;

    public Long getJobIdReqDTO() {
        return jobIdReqDTO;
    }

    public void setJobIdReqDTO(Long jobIdReqDTO) {
        this.jobIdReqDTO = jobIdReqDTO;
    }

    public String getJobNameReqDTO() {
        return jobNameReqDTO;
    }

    public void setJobNameReqDTO(String jobNameReqDTO) {
        this.jobNameReqDTO = jobNameReqDTO;
    }

    public String getJobLocationReqDTO() {
        return jobLocationReqDTO;
    }

    public void setJobLocationReqDTO(String jobLocationReqDTO) {
        this.jobLocationReqDTO = jobLocationReqDTO;
    }

    public String getJobDescriptionReqDTO() {
        return jobDescriptionReqDTO;
    }

    public void setJobDescriptionReqDTO(String jobDescriptionReqDTO) {
        this.jobDescriptionReqDTO = jobDescriptionReqDTO;
    }

    public Long getJobSalaryReqDTO() {
        return jobSalaryReqDTO;
    }

    public void setJobSalaryReqDTO(Long jobSalaryReqDTO) {
        this.jobSalaryReqDTO = jobSalaryReqDTO;
    }

    public JobRequestDTO(Long jobIdReqDTO, String jobNameReqDTO, String jobLocationReqDTO, String jobDescriptionReqDTO, Long jobSalaryReqDTO) {
        this.jobIdReqDTO = jobIdReqDTO;
        this.jobNameReqDTO = jobNameReqDTO;
        this.jobLocationReqDTO = jobLocationReqDTO;
        this.jobDescriptionReqDTO = jobDescriptionReqDTO;
        this.jobSalaryReqDTO = jobSalaryReqDTO;
    }

    public JobRequestDTO() {
    }
}
