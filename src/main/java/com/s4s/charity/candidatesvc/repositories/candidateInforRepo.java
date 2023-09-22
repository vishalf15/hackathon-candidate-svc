package com.s4s.charity.candidatesvc.repositories;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.s4s.charity.candidatesvc.model.PACandidateInfo;

@EnableScan
@Repository
public interface candidateInforRepo extends CrudRepository<PACandidateInfo, String> {

	//@Query(fields = "select * from pa_candidate_info where first_name= :name")
	List<PACandidateInfo> findByfirstName(@Param("name") String name);

	List<PACandidateInfo> findByzipCode(@Param("zipCode") String zipCode);

	List<PACandidateInfo> findBycity(@Param("city")  String city);


	
	
}
