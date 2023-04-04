package com.example.employeecrudapi.service;

import com.example.employeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
