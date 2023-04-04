package com.example.employeecrudapi.rest;

import com.example.employeecrudapi.dao.EmployeeDAO;
import com.example.employeecrudapi.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    // inject employee dao (use constructor injection)
    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
          employeeDAO=theEmployeeDAO;
    }

    // Expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee>findAll(){
        return employeeDAO.findAll();
    }
}
