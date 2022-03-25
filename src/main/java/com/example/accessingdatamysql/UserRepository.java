package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.account = ?1 and u.password = ?2")
    User findUserByAccountAndPassword(String account, String password);

    @Query("SELECT u FROM User u WHERE u.account = ?1")
    User findUserByAccount(String account);
}
