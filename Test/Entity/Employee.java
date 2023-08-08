package com.springTurotrial.Test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * It is an Entity class where we describe attributes of employees.
 * It also contains getter and setter to get and set the value of attributes.
 * This class represents Employeedata table in relational database.
 */
@Entity
@Table(name="Employeedata")
public class Employee {
	 /**
     * Id parameter contains id of an employee and it auto generated, it represents a column "id" in relational database.
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   
	private int id;
	/**
	 * name parameter stores name of an employee and it represents a column "name" in relational database.
	 */
	private String name;
	/**
	 * email parameter stores email of an employee and it represents a column "email" in relational database.
	 */
	private String email;
	/**
	 * phone parameter stores phone number of an employee and it represents a column "phone" in relational database.
	 */
	private long phone;

	/**
	 * It is zero args constructor which calls super class constructor.
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
   /**
    * This method is to get Id of an employee.
    * @return id of employee.
    */
	public int getId() {
		return id;
	}
   /**
    * This method sets the id of an employee.
    * @param id 
    */
	public void setId(int id) {
		this.id = id;
	}
   /**
    * This method is to get Name of an employee.
    * @return name of employee.
    */
	public String getName() {
		return name;
	}
    /**
     * This method sets the name of an employee.
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}
    /**
     * This method is to get phone Number of an employee.
     * @return phone of employee.
     */
	public long getPhone() {
		return phone;
	}
  /**
   *This method sets the phone number of an employee
   * @param phone
   */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
     * This method is to get email of an employee.
     * @return email of employee.
     */
	public String getEmail() {
		return email;
	}
	/**
	   *This method sets the phone number of an employee
	   * @param email
	   */
	public void setEmail(String email) {
		this.email = email;
	}

}
