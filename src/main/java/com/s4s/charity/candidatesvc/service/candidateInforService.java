package com.s4s.charity.candidatesvc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s4s.charity.candidatesvc.model.PACandidateInfo;
import com.s4s.charity.candidatesvc.repositories.candidateInforRepo;



@Service
public class candidateInforService {
	
	private static final Logger log = LoggerFactory.getLogger(candidateInforService.class);
	
	@Autowired
	private candidateInforRepo candidateRepo;
	
	public List<PACandidateInfo> getByFirstName(String firstName) {
		
		return candidateRepo.findByfirstName(firstName);
	}
	
   public List<PACandidateInfo> getByzipCode(String zipCode) {
		
		return candidateRepo.findByzipCode(zipCode);
	}
   
   public List<PACandidateInfo> getBycity(String city) {
		
		return candidateRepo.findBycity(city);
	}


}
