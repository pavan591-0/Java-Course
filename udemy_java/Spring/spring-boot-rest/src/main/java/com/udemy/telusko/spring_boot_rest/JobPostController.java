package com.udemy.telusko.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.telusko.spring_boot_rest.model.JobPost;
import com.udemy.telusko.spring_boot_rest.service.JobService;

import jakarta.websocket.server.PathParam;

//@Controller
@RestController
public class JobPostController {
	
	@Autowired
	public JobService service;
	
	@GetMapping("jobPosts")
//	@ResponseBody
	public List<JobPost> getAllJobs(){
		return service.returnAllJobPosts();
	}

	@GetMapping("jobPost/{postId}")
	public JobPost getJob(@PathVariable int postId) {
		return service.getJob(postId);
	}
	
	@PostMapping("jobPost")
	public JobPost addJob(@RequestBody JobPost job) {
		service.addJob(job);
		return service.getJob(job.getPostId());
	}
	
	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost job) {
		service.updateJob(job);
		return service.getJob(job.getPostId());
	}
	
	@DeleteMapping("jobPost/{postId}")
	public String deleteJob(@PathVariable int postId) {
		boolean value= service.deleteJob(postId);
		if(value) return "Successfully deleted";
		return "Invalid id provided";
	}
}
