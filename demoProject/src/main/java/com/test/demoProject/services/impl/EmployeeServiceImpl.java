package com.test.demoProject.services.impl;

import com.test.demoProject.models.Employee;
import com.test.demoProject.repositaries.EmployeeRepository;
import com.test.demoProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(Integer.parseInt(id));
    }
}
