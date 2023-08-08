package com.springTurotrial.Test.Payload;
/**
 * It is  a class used for security purpose (i.e. to hide actual or sensitive details).
 * It is used to transfer data from client end to server end.
 * @see <a href="C:/Users/ayush/eclipse-workspace/Test/Test/doc/com/springTurotrial/Test/Controller/EmployeeController.html">EmployeeController</a>
 */
public class EmployeedataTransfer {
	private int id;
	private String name;
	private String email; 
	private long phone;

	public EmployeedataTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
