package com.day4.jobdetails.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.day4.jobdetails.model.Job;
import com.day4.jobdetails.repository.JobRepo;

@Service
public class JobService {
    private JobRepo jobRepo;
    public JobService(JobRepo jobRepo){
        this.jobRepo=jobRepo;
    }

    public Job saveDetails(Job job){
            return jobRepo.save(job);
            
    }

    public List<Job> listofJobDetail(){
           return jobRepo.findAll();
    }

    public Job jobById(int jobId,Job job){
          return jobRepo.findById(jobId).orElse(new Job());
    }
}
