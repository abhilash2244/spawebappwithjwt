package com.eos.security.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eos.spa.model.security.User;
import java.security.MessageDigest;

@RestController
public class UserRepo {
	@Autowired
	UserRepository repos;
	
    @GetMapping(path="/getuser")
    public List<User> getUsers(){
    	return repos.findAll();
    }
//    @GetMapping(path="/getuser/{tid}")
//    public Optional<User> getUser(@PathVariable("tid") Long tid){
//    	return repos.findById(tid);
//    }
    @PostMapping(path="/adduser")
    public User addUser(@RequestBody User user) {
    	user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
   	
    	repos.save(user);
    	return user;
    }
    @PutMapping(path="/updateuser")
    public User updateUser(@RequestBody User user) {
    	repos.save(user);
    	return user;
    }
    
    @DeleteMapping(path="/user/{tid}")
    public String deleteUser(@PathVariable("tid") Long tid){
    	User t=repos.getOne(tid);
    	repos.delete(t);
		return "Deletd successfully";
    }
}
