package com.eos.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eos.spa.model.security.test;

public interface TestRepo extends JpaRepository<test, Integer>{

}
