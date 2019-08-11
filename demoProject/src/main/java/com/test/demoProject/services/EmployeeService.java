package com.test.demoProject.services;

import com.test.demoProject.models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployee(Integer Id);

    List<Employee> findAllEmployee();

    Employee saveEmployee(Employee employee);

    void deleteEmployee(String id);


}
