package com.s4s.charity.candidatesvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s4s.charity.candidatesvc.model.PACandidateInfo;
import com.s4s.charity.candidatesvc.service.candidateInforService;

@RestController
@RequestMapping("/PAyouth/candidates")
public class candidateInfoController {
	
	private static final Logger log = LoggerFactory.getLogger(candidateInfoController.class);
	
	@Autowired
	private candidateInforService candidateService;

	@GetMapping("/firstName/{name}")
	public List<PACandidateInfo> getCandidateByName(@PathVariable String name) {
		
		return candidateService.getByFirstName(name);
		
	}
	
	@GetMapping("/zipCode/{zipCode}")
	public List<PACandidateInfo> getCandidateByzipCode(@PathVariable String zipCode) {
		
		return candidateService.getByzipCode(zipCode);
		
	}

	@GetMapping("/city/{city}")
	public List<PACandidateInfo> getCandidateByCity(@PathVariable String city) {
		
		return candidateService.getBycity(city);
		
	}


}
