package com.project.JobApplication.jobDTO;

public class JobResponseDTO {

    private Long jobIdResDTO;

    private String jobNameResDTO;

    private String jobLocationResDTO;

    private String jobDescriptionResDTO;

    private Long jobSalaryResDTO;

    public Long getJobIdResDTO() {
        return jobIdResDTO;
    }

    public void setJobIdResDTO(Long jobIdResDTO) {
        this.jobIdResDTO = jobIdResDTO;
    }

    public String getJobNameResDTO() {
        return jobNameResDTO;
    }

    public void setJobNameResDTO(String jobNameResDTO) {
        this.jobNameResDTO = jobNameResDTO;
    }

    public String getJobLocationResDTO() {
        return jobLocationResDTO;
    }

    public void setJobLocationResDTO(String jobLocationResDTO) {
        this.jobLocationResDTO = jobLocationResDTO;
    }

    public String getJobDescriptionResDTO() {
        return jobDescriptionResDTO;
    }

    public void setJobDescriptionResDTO(String jobDescriptionResDTO) {
        this.jobDescriptionResDTO = jobDescriptionResDTO;
    }


    public Long getJobSalaryResDTO() {
        return jobSalaryResDTO;
    }

    public void setJobSalaryResDTO(Long jobSalaryResDTO) {
        this.jobSalaryResDTO = jobSalaryResDTO;
    }

    public JobResponseDTO(Long jobIdResDTO, String jobNameResDTO, String jobLocationResDTO, String jobDescriptionResDTO, Long jobSalaryResDTO) {
        this.jobIdResDTO = jobIdResDTO;
        this.jobNameResDTO = jobNameResDTO;
        this.jobLocationResDTO = jobLocationResDTO;
        this.jobDescriptionResDTO = jobDescriptionResDTO;
        this.jobSalaryResDTO = jobSalaryResDTO;
    }

    public JobResponseDTO() {
    }


}
