package com.example.demo.service;


import com.example.demo.entity.Classes;
import com.example.demo.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {


    @Autowired
    private final ClassRepository classRepository;

    public ClassServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }


    @Override
    public Classes createClasses(Classes classes) {
        return classRepository.save(classes);
    }

    @Override
    public Iterable<Classes> getClasses() {
        return classRepository.findAll();
    }

    @Override
    public Optional<Classes> getClassesById(long classNumber) {
        return classRepository.findById(classNumber);
    }


}
