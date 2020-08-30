package com.skillstorm.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.beans.Department;
import com.skillstorm.beans.Product;
import com.skillstorm.data.DepartmentRepository;
import com.skillstorm.data.ProductRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository dRepo;
	
	public void addDepartment(Department department) {
		dRepo.save(department);
	}

	public List<Department> findAll() {
		return dRepo.findAll();
	}

	public Department findById(int id) {
		return dRepo.findById(id).get();
	}

	public void deleteById(int id) {
		dRepo.deleteById(id);
	}

	public void updateDepartment(Department department) {
		dRepo.save(department);
	}

	public Department findByName(String dname) {
		return dRepo.findByName(dname);
	}
	
	@Autowired
	private ProductRepository pRepo;
	
	@Transactional
	public void testTransaction(Department d, Product p) {
		dRepo.save(d);
		pRepo.save(p);
	}
	
}
