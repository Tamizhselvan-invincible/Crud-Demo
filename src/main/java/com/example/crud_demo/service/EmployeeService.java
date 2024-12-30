package com.example.crud_demo.service;


import com.example.crud_demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();


    public EmployeeService(){
        employees.add(new Employee("1", "Iyanaar", "iyanaar.invincible.com", "Founder"));
        employees.add(new Employee("2", "Vijay Sarathi", "vijaysarathi.invincible@gmail.com", "Co-Founder"));
        employees.add(new Employee("3", "Tamizhselvan G", "tamizhselvan.invincible@gmail.com", "iOS Developer"));
        employees.add(new Employee("4", "Thanga Prakash", "thangaPrakash.invincible@gmail.com", "Android Developer"));
        employees.add(new Employee("5", "Diksha Hikare", "Diksha.invinsible@gmail.com", "Flutter Developer"));
    }


    // Add a new employee
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(String id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    // Update an employee
    public Optional<Employee> updateEmployee(String id, Employee updatedEmployee) {
        return getEmployeeById(id).map(existingEmployee -> {
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            existingEmployee.setRole(updatedEmployee.getRole());
            return existingEmployee;
        });
    }

    // Delete an employee
    public boolean deleteEmployee(String id) {
        return employees.removeIf(e -> e.getId().equals(id));
    }
}
