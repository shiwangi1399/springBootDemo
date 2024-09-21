package com.muskaanproject.springboot_demo.service;

import com.muskaanproject.springboot_demo.model.Employee;
import com.muskaanproject.springboot_demo.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface EmployeeService {



    public List<Employee> save(List<Employee> employee);

    public List<Employee> get();

    public Employee getbyId(Integer id);

    public String deleteById(Integer id);
}
