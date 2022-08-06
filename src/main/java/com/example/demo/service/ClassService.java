package com.example.demo.service;


import com.example.demo.entity.Classes;

import java.util.Optional;


public interface ClassService {

    Classes createClasses(Classes classes);
    Iterable<Classes> getClasses();
    Optional<Classes>  getClassesById(long classNumber);

}
