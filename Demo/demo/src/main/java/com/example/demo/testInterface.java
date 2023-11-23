package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testInterface extends CrudRepository<testTable, Long>{

	testTable findById(int id);

}
