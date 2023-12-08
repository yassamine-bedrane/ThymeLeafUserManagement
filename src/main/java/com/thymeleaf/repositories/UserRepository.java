package com.thymeleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thymeleaf.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
