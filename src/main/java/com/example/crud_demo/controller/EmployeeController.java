package com.example.crud_demo.controller;



import com.example.crud_demo.entity.Employee;
import com.example.crud_demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeservice) {
        this.employeeService = employeeservice;
    }

    // Add a new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by ID
    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id).orElse(null);
    }

    // Update an employee
    @PutMapping("employee/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee).orElse(null);
    }

    // Delete an employee
    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable String id) {
        if (employeeService.deleteEmployee(id)) {
            return;
        } else {
            return;
        }
    }
}
