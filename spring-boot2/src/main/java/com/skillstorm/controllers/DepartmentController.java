package com.skillstorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.beans.Department;
import com.skillstorm.beans.Product;
import com.skillstorm.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService dService;
	
	/*
	 * GET /departments -- get all departments.
	 * GET /departments/1 -- get method to get a department by Id.
	 * POST /departments -- post method to post a department.
	 * PUT /departments/1 -- put method to update a specific department by Id.
	 * DELETE /departments/1 -- delete method to delete a department by id.
	 */
	
	// @RequestMapping(method = RequestMethod.POST)
	@PostMapping("/departments")
	public void addDepartment(@RequestBody Department department) {
		dService.addDepartment(department);
		System.out.println("Got Post Request");
	}
	
	
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping(path = "/departments")
	public List<Department> findAll() {
		return 	dService.findAll();
	}
	
	@GetMapping(path = "/departments/{id}")
	public Department findById(@PathVariable int id) {
		return dService.findById(id);
	}
	
	@GetMapping(path = "/departments/name/{dname}")
	public Department findByName(@PathVariable String dname) {
		return dService.findByName(dname);
	}
	
	@DeleteMapping(path = "/departments/{id}")
	public void deleteById(@PathVariable int id) {
		dService.deleteById(id);
	}
	
	@PutMapping(path = "/departments", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateDepartment(@PathVariable Department department) {
		dService.updateDepartment(department);
	}
	
	@GetMapping(path = "/transaction")
	public void testTransaction() {
		Department d = new Department();
		d.setId(0);
		d.setDesc("Transaction Description");
		d.setName("Transaction Name");
		
		Product p = new Product();
		p.setId(0);
		p.setName("Transaction P Name");
		p.setDescription("Transaction P Desc");
		p.setDepartment(d);
		
		dService.testTransaction(d, p);
	}
	
}
