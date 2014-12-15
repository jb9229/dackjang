package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.TestClass;

import java.lang.Long;
import java.util.List;


public interface TestRespository extends JpaRepository<TestClass, Long> {
	List<TestClass> findByname(String name);
}
