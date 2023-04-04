package com.example.employeecrudapi.dao;

import com.example.employeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
