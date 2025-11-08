package com.udemy.telusko.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.telusko.spring_boot_rest.model.JobPost;
import com.udemy.telusko.spring_boot_rest.repo.JobRepo;



@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();
		
	}

	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);	
	}

	public JobPost getJob(int postId) {
		return repo.getJob(postId);
	}

	public void addJob(JobPost job) {
		// TODO Auto-generated method stub
		repo.addJobPost(job);	
	}

	public void updateJob(JobPost job) {
		repo.updateJob(job);
	}

	public boolean deleteJob(int postId) {
		return repo.deleteJob(postId);
	}

	
}