package com.example.employeecrudapi.dao;

import com.example.employeecrudapi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    // Define the field for Entity Manager
    private EntityManager entityManager;

    // Set up Constructor Injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager=theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee>theQuery=entityManager.createQuery("from Employee",Employee.class);

        // execute a query and get result list
        List<Employee>employees=theQuery.getResultList();

        // return the results
        return employees;
    }
}
