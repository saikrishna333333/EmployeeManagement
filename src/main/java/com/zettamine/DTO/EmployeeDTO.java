package com.zettamine.DTO;

import java.util.List;

import com.zettamine.DAO.Employee;

public interface EmployeeDTO {
	
	int saveEmployee(Employee emp);
	int updateEmployee(Employee emp);
	Employee getEmpByid(int id);
	List<Employee> getAll();
	

}
