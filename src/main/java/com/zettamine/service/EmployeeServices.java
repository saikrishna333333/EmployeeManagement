package com.zettamine.service;

import java.util.List;

import com.zettamine.DAO.Employee;

public interface EmployeeServices {
	
	void saveEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void getEmpByid(int id);
	void getAll();
}
