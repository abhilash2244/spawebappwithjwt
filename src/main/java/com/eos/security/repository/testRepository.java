package com.eos.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eos.spa.model.security.test;

@RestController
public class testRepository {
	@Autowired
	TestRepo repo;
	
    @GetMapping(path="/test")
    public List<test> getTests(){
    	return repo.findAll();
    }
    @GetMapping(path="/test/{tid}")
    public Optional<test> getTest(@PathVariable("tid") int tid){
    	return repo.findById(tid);
    }
    @PostMapping(path="test")
    public test addTest(@RequestBody test test) {
    	repo.save(test);
    	return test;
    }
    @PutMapping(path="test")
    public test updateTest(@RequestBody test test) {
    	repo.save(test);
    	return test;
    }
    
    @DeleteMapping(path="/test/{tid}")
    public String deleteTest(@PathVariable("tid") int tid){
    	test t=repo.getOne(tid);
    	repo.delete(t);
		return "Deletd successfully";
    }
}
