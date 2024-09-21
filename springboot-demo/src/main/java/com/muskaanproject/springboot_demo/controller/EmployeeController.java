package com.muskaanproject.springboot_demo.controller;

import com.muskaanproject.springboot_demo.exception.EmployeeNotFoundException;
import com.muskaanproject.springboot_demo.model.Employee;
import com.muskaanproject.springboot_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<List<Employee> >save(@RequestBody List<Employee> employee)
    {
        List<Employee> savedEmployee = employeeService.save(employee);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> get()
    {
        return new ResponseEntity<>(employeeService.get(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getbyId(@PathVariable Integer id) {
        Employee emp = employeeService.getbyId(id);
        if (emp != null) {
            return new ResponseEntity<Employee>(emp, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id)
    {
       Employee emd = employeeService.getbyId(id);
       if(emd!=null)
       {
        return new ResponseEntity<String>(employeeService.deleteById(id), HttpStatus.OK);
    }
       else
       {
           throw new RuntimeException( "Employee with id "+id+ "not found cutie :)");
       }

       }

}
