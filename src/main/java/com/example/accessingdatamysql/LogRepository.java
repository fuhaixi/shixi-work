package com.example.accessingdatamysql;
import org.springframework.data.repository.CrudRepository;


public interface LogRepository extends CrudRepository<Log, Integer> {
   
}
