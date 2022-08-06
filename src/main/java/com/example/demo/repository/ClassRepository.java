package com.example.demo.repository;


import com.example.demo.entity.Classes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClassRepository extends CrudRepository<Classes, Long> {


}
