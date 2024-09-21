package com.muskaanproject.springboot_demo.service;

import com.muskaanproject.springboot_demo.model.Employee;
import com.muskaanproject.springboot_demo.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> save(List<Employee> employee) {
        return employeeDao.saveAll(employee);
    }

    public List<Employee> get()
    {
        return employeeDao.findAll();
    }

    @Override
    public Employee getbyId(Integer id) {
        return employeeDao.findById(id).orElse(null);
    }

    public String deleteById(Integer id)
    {
         employeeDao.deleteById(id);
         return "deleted sucessfully";
    }
}
