package com.skillstorm.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.beans.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	public Department findByName(String name);
}
