package com.skillstorm.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.beans.Department;
import com.skillstorm.beans.Product;
import com.skillstorm.data.ProductRepository;

@RestController // @Controller + @ResponseBody
public class ProductController {
	
	@Autowired
	private ProductRepository pRepo;
	
	@GetMapping(path = "/departments/products")
	public List<Product> getAllProducts() {
		return pRepo.findAll();
	}
	
	/* @GetMapping(path = "/departments/{id}/products")
	public List<Product> getAllProductsByDepartment(@PathVariable int id) {
		return pRepo.findAllByDepartmentId(id);
	} */
	
	@GetMapping(path = "/departments/{id}/products/{pid}")
	public ResponseEntity<Product> getProduct(@PathVariable int pid) {
		//Manipulate Http response
		ResponseEntity<Product> response = new ResponseEntity<Product>(pRepo.findById(pid).get(), HttpStatus.I_AM_A_TEAPOT);
		return response;
	}
	
	@PostMapping(path = "/departments/{id}/products")
	public void addProduct(@PathVariable int id, @Valid @RequestBody Product product) {
		Department d = new Department();
		d.setId(id);
		product.setDepartment(d);
		pRepo.save(product);
	}
	
	@PutMapping(path = "/departments/{id}/products")
	public void updateProduct(@PathVariable int id, @RequestBody Product product) {
		pRepo.save(product);
	}
	
	@DeleteMapping(path = "/departments/products/{id}")
	public void updateProduct(@PathVariable int pid) {
		pRepo.deleteById(pid);
	}
	
	@GetMapping(path = "/custom/{id}")
	public Product customProduct(@PathVariable int id) {
		return pRepo.getCustom(id);
	}
	
}
