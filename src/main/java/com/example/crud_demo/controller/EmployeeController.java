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
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    // Get all employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    // Get employee by ID
    @GetMapping("employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update an employee
    @PutMapping("employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete an employee
    @DeleteMapping("employee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
        if (employeeService.deleteEmployee(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}