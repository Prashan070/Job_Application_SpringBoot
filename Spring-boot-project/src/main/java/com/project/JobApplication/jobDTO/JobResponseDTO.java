package com.project.JobApplication.jobDTO;

public class JobResponseDTO {

    private Long jobIdResDTO;

    private String jobNameResDTO;

    private String jobLocationResDTO;

    private String jobDescriptionResDTO;

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


    public JobResponseDTO(Long jobIdResDTO, String jobNameResDTO, String jobLocationResDTO, String jobDescriptionResDTO) {
        this.jobIdResDTO = jobIdResDTO;
        this.jobNameResDTO = jobNameResDTO;
        this.jobLocationResDTO = jobLocationResDTO;
        this.jobDescriptionResDTO = jobDescriptionResDTO;
    }

    public JobResponseDTO() {
    }


}
