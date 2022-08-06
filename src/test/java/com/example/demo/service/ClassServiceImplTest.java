package com.example.demo.service;

import com.example.demo.repository.ClassRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class ClassServiceImplTest {

    @InjectMocks
    private ClassServiceImpl classService;

    @Mock
    private ClassRepository classRepository;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createClasses() {
    }

    @Test
    public void getClasses() {
    }

    @Test
    public void getClassesById() {
    }
}