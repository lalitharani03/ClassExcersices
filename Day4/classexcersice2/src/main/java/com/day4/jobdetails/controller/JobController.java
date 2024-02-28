package com.day4.jobdetails.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day4.jobdetails.model.Job;
import com.day4.jobdetails.services.JobService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class JobController {
    private JobService jobService;
    public JobController(JobService jobService){
        this.jobService=jobService;
    }  
    @PostMapping("/api/job")
    public ResponseEntity<Job> postjobDetails(@RequestBody Job job) {
        Job jobdetail=jobService.saveDetails(job);
        return new ResponseEntity<>(jobdetail,HttpStatus.CREATED);
    }
    @GetMapping("/api/job")
    public ResponseEntity<List<Job>> getlistofjobDetail() {
        List<Job> li=jobService.listofJobDetail();
        return new ResponseEntity<>(li,HttpStatus.OK);
    }
    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<Job> getjobById(@PathVariable("jobId") int jobId,Job job) {
        Job j=jobService.jobById(jobId,job);
        if(j!=null){
        return new ResponseEntity<>(j,HttpStatus.OK);
    }
    else{
            return new ResponseEntity<>(j,HttpStatus.NOT_FOUND);

        }
    }
    
    
}