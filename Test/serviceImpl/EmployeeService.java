package com.springTurotrial.Test.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springTurotrial.Test.Entity.Employee;
import com.springTurotrial.Test.Payload.EmployeedataTransfer;

import com.springTurotrial.Test.Repository.EmployeeRepository;
import com.springTurotrial.Test.Service.EmployeeServiceInterface;
/**
 * This is an implementation class for service layer.
 */
@Service
public class EmployeeService implements EmployeeServiceInterface {

/**
 * EmployeeRepository object to manage,store and access data of employee entity in relational database.
 */
	@Autowired
	private EmployeeRepository employeeRepo;

	/**
	 * This method saves the details of employee in database using employeeRepo.save() method.
	 * @param obj - It is an EmployeedataTransfer class object.
	 * @return employee which has been saved.
	 */
	@Override
	public EmployeedataTransfer create(EmployeedataTransfer obj) {
		Employee e = this.dtoToEmployee(obj);
		this.employeeRepo.save(e);
		return (EmployeeToDto(e));

	}
    /**
     * This method updates the details of employee.
     */
	@Override
	public EmployeedataTransfer update(EmployeedataTransfer obj, Integer id) {
		Optional<Employee> e = this.employeeRepo.findById(id);
		Employee emp = e.get();
		emp.setEmail(obj.getEmail());
		emp.setName(obj.getName());
		emp.setPhone(obj.getPhone());
		Employee UpdatedEmp = this.employeeRepo.save(emp);
		return (EmployeeToDto(UpdatedEmp));
	}
    /**
     * This method get the details of an employee by using its id.
     */
	@Override
	public EmployeedataTransfer getById(Integer id) {
		Optional<Employee> e=this.employeeRepo.findById(id);
		Employee emp=e.get();
		
		return (EmployeeToDto(emp));
	}
    /**
     * This method is used to get the details of all employees.
     */
	@Override
	public List <EmployeedataTransfer> getAll() {
		List<Employee> emp=this.employeeRepo.findAll();
		List<EmployeedataTransfer> e=new ArrayList<>();
		for(int i=0;i<emp.size();i++)
		{
		 e.add(i,EmployeeToDto(emp.get(i)));
		}
		return e;
	}
     /**
      * This method is for deleting an employee details using its id.
      */
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> e=this.employeeRepo.findById(id);
		Employee emp=e.get();
		this.employeeRepo.delete(emp);
	}
  /**
   * This method is for converting dto object to employee object.
   * @param obj - EmployeedataTranfer object
   * @return Employee class object.
   */
	public Employee dtoToEmployee(EmployeedataTransfer obj) {
		Employee e=new Employee();
		e.setEmail(obj.getEmail());
		e.setName(obj.getName());
		e.setId(obj.getId());
		e.setPhone(obj.getPhone());
		return e;
	}
    /**
     * This method is for converting employee object to dto object.
     * @param e - Employee object
     * @return EmployeedataTransfer class object.
     */
	public EmployeedataTransfer EmployeeToDto(Employee e) {
		EmployeedataTransfer obj=new EmployeedataTransfer();
		obj.setId(e.getId());
		obj.setEmail(e.getEmail());
		obj.setName(e.getName());
		obj.setPhone(e.getPhone());
		return obj;

	}

}
