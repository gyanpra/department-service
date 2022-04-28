package com.boo.departmentservice.service;

import com.boo.departmentservice.entity.Department;
import com.boo.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Inside Save Department of Department Service, adding: {}", department);
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id){
        log.info("Inside Find Department of Department Service, finding: {}", id);
        return departmentRepository.findById(id).orElse(null);
    }


}
