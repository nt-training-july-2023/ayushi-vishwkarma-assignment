package com.springTurotrial.Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springTurotrial.Test.Entity.Employee;

/**
 * It is an interface that extends JpaRepository.
 * JpaRepository contains the api to perform basic CRUD operations.
 * Here we store , access and manage data of Employee Entity.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
