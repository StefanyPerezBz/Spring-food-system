package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManageEmployeeRepository extends JpaRepository<Employee, Integer> {
     Optional<Employee> findById(Integer id);
    void deleteById(Integer id);
}
