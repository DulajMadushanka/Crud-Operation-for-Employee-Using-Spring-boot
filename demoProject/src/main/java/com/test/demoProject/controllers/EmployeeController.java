package com.test.demoProject.controllers;

import com.test.demoProject.models.Department;
import com.test.demoProject.models.Employee;
import com.test.demoProject.repositaries.DepartmentRepository;
import com.test.demoProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentRepository  departmentRepository;

    @GetMapping("/all")
    public List<Employee> allEmployee()
    {
        return employeeService.findAllEmployee();
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String id){
        return employeeService.findEmployee(Integer.parseInt(id));
    }

    @PutMapping("/employee/update/{id}")
    public Boolean updateEmployee(@PathVariable String id, @RequestBody Employee employee){
            employeeService.saveEmployee(employee);
            return true;
    }
    @DeleteMapping("/employee/delete/{id}")
    public Boolean deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return true;
    }



}
