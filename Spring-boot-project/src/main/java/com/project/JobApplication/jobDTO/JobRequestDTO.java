package com.project.JobApplication.jobDTO;


public class JobRequestDTO {

    private Long jobIdReqDTO;

    private String jobNameReqDTO;

    private String jobLocationReqDTO;

    private String jobDescriptionReqDTO;

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

    public JobRequestDTO(Long jobIdReqDTO, String jobNameReqDTO, String jobLocationReqDTO, String jobDescriptionReqDTO) {
        this.jobIdReqDTO = jobIdReqDTO;
        this.jobNameReqDTO = jobNameReqDTO;
        this.jobLocationReqDTO = jobLocationReqDTO;
        this.jobDescriptionReqDTO = jobDescriptionReqDTO;
    }

    public JobRequestDTO() {
    }
}
