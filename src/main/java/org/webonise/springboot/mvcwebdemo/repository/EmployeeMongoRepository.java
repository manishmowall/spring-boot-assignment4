package org.webonise.springboot.mvcwebdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.webonise.springboot.mvcwebdemo.model.Employee;

public interface EmployeeMongoRepository extends CrudRepository<Employee, String> {
}
