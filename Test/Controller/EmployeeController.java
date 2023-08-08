package com.springTurotrial.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springTurotrial.Test.Payload.EmployeedataTransfer;
import com.springTurotrial.Test.Repository.EmployeeRepository;
import com.springTurotrial.Test.serviceImpl.EmployeeService;
/** 
 * It is a Controller which is an initial stage.
 * The Controller is responsible for processing incoming requests from browser or user.
 * It also gives response to user.
 */
@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	/**
	 * EmployeeService class object, empService object will get all the funtionalities of EmployeeService class.
	 */
	@Autowired
	private EmployeeService empService;

	/**
	 * This method is for adding employees in database.
	 * @param obj - It is an object of EmployeedataTransfer class in this the data given by user from browser is stored and processed.
	 * @return EmployeedataTransfer class object.
	 */
	@PostMapping("/Create")
	public ResponseEntity<EmployeedataTransfer> createEmp(@RequestBody EmployeedataTransfer obj) {
		EmployeedataTransfer emp = this.empService.create(obj);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
    /**
     * This is for updating employee details.
     * @param obj - It is an object of EmployeedataTransfer class in this the data given by user from browser is stored and processed.
     * @param id - It is a pathVariable, It is an id of employee to update its details.
     * @return - EmployeedataTransfer class object.
     */
	@PutMapping("/update{id}")
	public ResponseEntity<EmployeedataTransfer> updateEmp(@RequestBody EmployeedataTransfer obj,
			@PathVariable("id") Integer id) {
		EmployeedataTransfer emp = this.empService.update(obj, id);
		return ResponseEntity.ok(emp);
	}
    /**
     * This is to get the details of a single employee using its id.
     * @param id - It is a pathVariable, It is an id of employee to get its details.
     * @return Details of Employee with that id.
     */
	@GetMapping("/{id}")
	public ResponseEntity<EmployeedataTransfer> getById(@PathVariable("id") Integer id) {
		EmployeedataTransfer emp = this.empService.getById(id);
		return ResponseEntity.ok(emp);
	}
    /**
     * This method is to get the details of all employee.
     * @return Details of all Employee.
     */
	@GetMapping("/")
	public ResponseEntity<List<EmployeedataTransfer>> getAll() {
		return ResponseEntity.ok(this.empService.getAll());
	}

	/**
	 * This method is for deletion of an employee.
	 * @param id - It is a pathVariable, It is an id of employee to delete an employee.
	 * @return It returns the message when employee get deleted.
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable("id") Integer id) {
		this.empService.delete(id);
		return ResponseEntity.ok("Employee Deleted Successfully");
	}
}
