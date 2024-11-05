package Com.Entity;

import jakarta.persistence.*;

@Entity
public class Employee {

	@Id
	int emp_id;
	String emp_name;
	String Address;
	int salary;

	public Employee() {

	}

	public Employee(int emp_id, String emp_name, String address, int salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		Address = address;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Address=" + Address + ", salary=" + salary
				+ "]";
	}
}