package com.example.demo;


import com.example.demo.repository.ClassRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootTimetableApplicationTests {

    @Autowired
    private ClassRepository classRepository;

    @Test
    void contextLoads() {
    }


    @Test
    public void createClasses() {




    }

}
