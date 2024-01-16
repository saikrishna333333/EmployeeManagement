package com.zettamine.DAO;

import java.util.Objects;

public class Employee {
	private int empid;
	private String Name;
	private double salary;
	private String dept;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Name, dept, empid, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(dept, other.dept) && empid == other.empid
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", Name=" + Name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(int empid, String name, double salary, String dept) {
		super();
		this.empid = empid;
		Name = name;
		this.salary = salary;
		this.dept = dept;
	}

}
