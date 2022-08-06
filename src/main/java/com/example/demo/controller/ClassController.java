package com.example.demo.controller;


import com.example.demo.entity.Classes;
import com.example.demo.service.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClassController {


    @Autowired
    private final ClassServiceImpl classService;

    public ClassController(ClassServiceImpl classService) {
        this.classService = classService;
    }


    @PostMapping("/class")
    public Classes saveClass( @RequestBody Classes classes) {

        return classService.createClasses(classes);
    }

    @GetMapping("/class/")
    public Iterable<Classes> getAllClassData() {
        return classService.getClasses();
    }

    @GetMapping("{classid}")
    public Optional<Classes> getClassDataById(@PathVariable("classid") long classNumber) throws ClassNotFoundException {


        if (classNumber < 0) {
            throw new ClassNotFoundException("Class number not found --" + classNumber);
        }

        return classService.getClassesById(classNumber);
    }


}
