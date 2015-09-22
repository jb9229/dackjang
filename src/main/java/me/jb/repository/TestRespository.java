package me.jb.repository;

import me.jb.domain.TestClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.Long;
import java.util.List;


public interface TestRespository extends JpaRepository<TestClass, Long> {
	List<TestClass> findByname(String name);
}
